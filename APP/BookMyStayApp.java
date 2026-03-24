import java.util.HashMap;
import java.util.Map;

class RoomInventory {

    private final Map<String, Integer> roomAvailability;

    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    private void initializeInventory() {
        roomAvailability.put("Single", 5);
        roomAvailability.put("Double", 3);
        roomAvailability.put("Suite", 2);
    }

    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    public void updateAvailability(String roomType, int count) {
        roomAvailability.put(roomType, count);
    }
}

// 🔹 Base class (optional but clean design)
class Room {
    public void displayRoomDetails() {
        System.out.println("Room details not specified.");
    }
}

// 🔹 Single Room
class SingleRoom extends Room {
    @Override
    public void displayRoomDetails() {
        System.out.println("Type: Single Room");
        System.out.println("Price: ₹1000 per night");
        System.out.println("Capacity: 1 person");
    }
}

// 🔹 Double Room
class DoubleRoom extends Room {
    @Override
    public void displayRoomDetails() {
        System.out.println("Type: Double Room");
        System.out.println("Price: ₹2000 per night");
        System.out.println("Capacity: 2 persons");
    }
}

// 🔹 Suite Room
class SuiteRoom extends Room {
    @Override
    public void displayRoomDetails() {
        System.out.println("Type: Suite Room");
        System.out.println("Price: ₹5000 per night");
        System.out.println("Capacity: 4 persons");
    }
}

// 🔹 Main Class
public class BookMyStayApp {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        SingleRoom singleRoom = new SingleRoom();
        DoubleRoom doubleRoom = new DoubleRoom();
        SuiteRoom suiteRoom = new SuiteRoom();

        System.out.println("Single Room:");
        singleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + inventory.getRoomAvailability().get("Single"));

        System.out.println();

        System.out.println("Double Room:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + inventory.getRoomAvailability().get("Double"));

        System.out.println();

        System.out.println("Suite Room:");
        suiteRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + inventory.getRoomAvailability().get("Suite"));
    }
}