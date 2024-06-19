package core.basesyntax.semaphore.gptexample;

import java.util.concurrent.Semaphore;

class ConferenceRoomBookingSystem {
    private final Semaphore semaphore;
    private final int totalRooms;

    public ConferenceRoomBookingSystem(int totalRooms) {
        this.totalRooms = totalRooms;
        this.semaphore = new Semaphore(totalRooms, true);
    }

    public BookingResult attemptBooking(String user, int roomsRequired) {
        try {
            // Try to acquire the required number of permits (rooms)
            semaphore.acquire(roomsRequired);
            return new BookingResult(user, true, "Booking successful for " + roomsRequired + " rooms.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return new BookingResult(user, false, "Booking interrupted.");
        }
    }

    public void cancelBooking(int roomsToRelease) {
        // Release the specified number of permits (rooms)
        semaphore.release(roomsToRelease);
    }

    public static void main(String[] args) {
        ConferenceRoomBookingSystem bookingSystem = new ConferenceRoomBookingSystem(5); // Total 5 rooms

        // Example usage
        BookingResult result1 = bookingSystem.attemptBooking("User1", 2);
        System.out.println(result1.message()); // Booking successful for 2 rooms.

        BookingResult result2 = bookingSystem.attemptBooking("User2", 3);
        System.out.println(result2.message()); // Booking successful for 3 rooms.

        BookingResult result3 = bookingSystem.attemptBooking("User3", 1);
        System.out.println(result3.message()); // No rooms available, as all 5 are booked.

        // Cancel a booking
        bookingSystem.cancelBooking(2);
        System.out.println("User1 cancelled booking for 2 rooms.");

        BookingResult result4 = bookingSystem.attemptBooking("User3", 1);
        System.out.println(result4.message()); // Booking successful for 1 room.
    }
}



