package org.example.lessons.lesson26.homeworks

import java.io.File

fun main() {
    // 1
    File("workspace/task1/example.txt").apply {
        writeText("Hello, Kotlin!")
        println("Файл существует? ${exists()}")
    }

    // 2
    File("workspace/task2/testDir").also { dir ->
        dir.mkdirs()
        println("Это директория? ${dir.isDirectory}")
        println("Абсолютный путь: ${dir.absolutePath}")
    }

    // 3
    File("workspace/task3/structure").also { structure ->
        structure.mkdirs()

        structure.resolve("myDir").also { myDir ->
            myDir.mkdirs()
            myDir.resolve("subDir1").mkdirs()
            myDir.resolve("subDir2").mkdirs()

            val subDirsExist = listOf("subDir1", "subDir2").all { sub ->
                myDir.resolve(sub).isDirectory
            }
            println("Все поддиректории созданы: $subDirsExist")
        }
    }

    // 4
    File("workspace/task4/temp").also { tempDir ->
        tempDir.mkdirs()

        File(tempDir, "file1.txt").writeText("File 1")
        File(tempDir, "file2.txt").writeText("File 2")

        File(tempDir, "subDir").also { subDir ->
            subDir.mkdirs()
            File(subDir, "nestedFile.txt").writeText("Nested File")
        }
    }

    File("workspace/task4").also { task4Dir ->
        fun deleteRecursively(file: File) {
            if (file.isDirectory) {
                file.listFiles()?.forEach { deleteRecursively(it) }
            }
            file.delete()
        }
        deleteRecursively(task4Dir)
        println("Директория workspace/task4 удалена")
    }

    // 5
    File("workspace/task5/config/config.txt").also { configFile ->
        configFile.parentFile.mkdirs() // создаём директорию config
        configFile.writeText(
            """
            host=localhost
            port=8080
            username=admin
            password=1234
            """.trimIndent()
        )
    }

    File("workspace/task5/config/config.txt").also { configFile ->
        configFile.readLines()
            .map { it.substringAfter("=") }
            .forEach { println(it) }
    }

    // 6
    val workspace = File("workspace")

    workspace.walk()
        .filter { it.isDirectory }
        .forEach { println("Directory: ${it.absolutePath}") }

    workspace.walk()
        .filter { it.isFile }
        .forEach { println("File: ${it.absolutePath}") }

    // 7
    val docsDir = File("workspace/task7/docs").apply { mkdirs() }

    val readmeFile = docsDir.resolve("readme.md").apply {
        if (!exists()) {
            writeText("This is a README file.")
        }
    }

    println(readmeFile.readText())

    // 8
    val dataDir = File("workspace/task8/data")
    val backupDir = File("workspace/task8/backup").apply { mkdirs() }

    val filesToCreate = listOf(
        "1/4/prod/data14.mysql",
        "2/3/prod/data23.mysql",
        "5/2/prod/data52.mysql"
    )

    filesToCreate.forEach { relativePath ->
        dataDir.resolve(relativePath).apply {
            parentFile.mkdirs()
            createNewFile()
        }
    }

    dataDir.walkTopDown().filter { it.isFile }.forEach { file ->
        val relativePath = file.relativeTo(dataDir)
        val destFile = backupDir.resolve(relativePath)
        destFile.parentFile.mkdirs()
        file.copyTo(destFile, overwrite = true)
    }

    println("Файлы скопированы в backup, структура сохранена.")
}
