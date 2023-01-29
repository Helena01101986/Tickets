import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.Ticket;
import ru.netology.TicketManager;
import ru.netology.TicketRepository;

public class TicketManagerTest {

    TicketRepository repo = new TicketRepository();
    TicketManager manager = new TicketManager(repo);
    Ticket ticket1 = new Ticket(1, 1_299, 95, "LED", "HTA");
    Ticket ticket2 = new Ticket(2, 2_199, 95, "HTA", "LED");
    Ticket ticket3 = new Ticket(3, 1_500, 60, "LED", "HTA");
    Ticket ticket4 = new Ticket(4, 5_000, 100, "LED", "HTA");
    Ticket ticket5 = new Ticket(5, 1_600, 75, "LED", "HTA");
    Ticket ticket6 = new Ticket(6, 1_500, 150, "LED", "HTA");
    Ticket ticket7 = new Ticket(7, 8_000, 150, "SVO", "SVX");

    @BeforeEach
    public void setup() {
        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);
        repo.add(ticket6);
        repo.add(ticket7);
    }


    @Test
    public void shouldSortTickets() {

        Ticket[] expected = {ticket1, ticket3, ticket6, ticket5, ticket4};
        Ticket[] actual = manager.findAll("LED", "HTA");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindOneTicket() {
        Ticket[] expected = {ticket7};
        Ticket[] actual = manager.findAll("SVO", "SVX");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotFindTickets() {
        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("HTA", "IRK");

        Assertions.assertArrayEquals(expected, actual);
    }




}

