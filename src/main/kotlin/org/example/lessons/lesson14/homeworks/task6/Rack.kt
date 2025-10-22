package org.example.lessons.lesson14.homeworks.task6

// Характеристики:

//Список полок (shelves): хранит полки стеллажа.
//Максимальное количество полок.
//Методы:

//Добавление Полки (addShelf):
//Добавляет новую полку в стеллаж.
//Возвращает true, если полка была успешно добавлена или false если стеллаж уже заполнен или была попытка добавить полку которая уже установлена.
//Удаление Полки (removeShelf):
//Принимает индекс полки для удаления.
//Удаляет полку по указанному индексу.
//Возвращает список предметов полки, если полка была успешно удалена или пустой список если полка не существует.
//Добавление Предмета (addItem):
//Добавляет предмет на первую свободную полку.
//Возвращает true, если предмет успешно добавлен, и false, если на всех полках недостаточно места.
//Удаление Предмета (removeItem):
//Находит и удаляет только один предмет с любой полки.
//Возвращает true, если предмет был удален, и false, если такой предмет не найден.
//Проверка наличия предмета на стеллаже (containsItem):
//Возвращает true если предмет есть на одной из полок
//Получение списка полок (getShelves):
//Возвращает неизменяемый список полок
//Печать Содержимого (printContents):
//Выводит в консоль информацию о каждой полке: индекс, вместимость, оставшуюся вместимость, список предметов. Информацию выводить в наглядном читаемом виде
//Сложное удаление полки (advancedRemoveShelf):
//Принимает индекс полки для удаления
//Перераспределяет предметы по имеющимся полкам, начиная с самых длинных. Если очередной предмет никуда не вмещается, его нужно пропустить и попробовать разместить следующий.
//Удаляет полку с оставшимися предметами
//Возвращает неизменяемый список предметов, которые не удалось удалить или пустой список если полки с таким индексом нет.

class Rack (val shelves: MutableList<Shelf>, val qty: Int) {
    fun addShelf (newShelf: Shelf): Boolean {
        shelves.add(newShelf)
        return true
    }

    fun removeShelf (indexOfItem: Int): MutableList<String> {
        return if (indexOfItem in shelves.indices) {
            val removedShelf = shelves.removeAt(indexOfItem)
            removedShelf.items
        } else {
            mutableListOf()
        }
    }

    fun addItem (nameOfItem: String): Boolean {
        for (shelf in shelves) {
            if (shelf.canAccommodate(nameOfItem)) {
                shelf.addItem(nameOfItem)
                return true
            }
        }
        return false
    }

    fun removeItem(nameOfItem: String): Boolean {
        for (shelf in shelves) {
            if (shelf.removeItem(nameOfItem)) {
                return true
            }
        }
        return false
    }
}