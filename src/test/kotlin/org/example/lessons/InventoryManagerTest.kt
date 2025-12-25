import org.example.lessons.lesson30.homeworks.InventoryManager
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class InventoryManagerTest {

    @Test
    fun `getItemCount returns 0 for absent item`() {
        val manager = InventoryManager(10)
        assertEquals(0, manager.getItemCount("Sword"))
    }

    @Test
    fun `addItem adds new item`() {
        val manager = InventoryManager(10)
        manager.addItem("Sword", 3)
        assertEquals(3, manager.getItemCount("Sword"))
    }

    @Test
    fun `addItem adds to existing item`() {
        val manager = InventoryManager(10)
        manager.addItem("Sword", 3)
        manager.addItem("Sword", 2)
        assertEquals(5, manager.getItemCount("Sword"))
    }

    @Test
    fun `addItem throws exception if capacity exceeded`() {
        val manager = InventoryManager(5)
        manager.addItem("Sword", 5)

        assertThrows<IllegalStateException> {
            manager.addItem("Shield", 1)
        }
    }

    @Test
    fun `removeItem returns false if item not found`() {
        val manager = InventoryManager(10)
        assertFalse(manager.removeItem("Sword", 1))
    }

    @Test
    fun `removeItem returns false if quantity too large`() {
        val manager = InventoryManager(10)
        manager.addItem("Sword", 2)

        assertFalse(manager.removeItem("Sword", 3))
    }

    @Test
    fun `removeItem removes part of items`() {
        val manager = InventoryManager(10)
        manager.addItem("Sword", 5)

        assertTrue(manager.removeItem("Sword", 2))
        assertEquals(3, manager.getItemCount("Sword"))
    }

    @Test
    fun `removeItem removes item completely`() {
        val manager = InventoryManager(10)
        manager.addItem("Sword", 3)

        assertTrue(manager.removeItem("Sword", 3))
        assertEquals(0, manager.getItemCount("Sword"))
    }

    @Test
    fun `capacity counts all items`() {
        val manager = InventoryManager(5)
        manager.addItem("Sword", 2)
        manager.addItem("Shield", 3)

        assertThrows<IllegalStateException> {
            manager.addItem("Potion", 1)
        }
    }

    @Test
    fun `removeItem frees capacity`() {
        val manager = InventoryManager(5)
        manager.addItem("Sword", 5)
        manager.removeItem("Sword", 2)

        manager.addItem("Potion", 2)
        assertEquals(2, manager.getItemCount("Potion"))
    }

    @Test
    fun `addItem with zero quantity throws`() {
        val manager = InventoryManager(10)

        assertThrows<IllegalArgumentException> {
            manager.addItem("Sword", 0)
        }
    }

    @Test
    fun `addItem with negative quantity throws`() {
        val manager = InventoryManager(10)

        assertThrows<IllegalArgumentException> {
            manager.addItem("Sword", -1)
        }
    }

    @Test
    fun `removeItem with zero quantity succeeds but changes nothing`() {
        val manager = InventoryManager(10)
        manager.addItem("Sword", 3)

        assertTrue(manager.removeItem("Sword", 0))
        assertEquals(3, manager.getItemCount("Sword"))
    }
}
