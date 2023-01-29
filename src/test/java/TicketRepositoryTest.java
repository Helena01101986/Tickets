import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.Ticket;
import ru.netology.TicketRepository;

public class TicketRepositoryTest {
    Ticket[] tickets = new Ticket[0];
    TicketRepository repo = new TicketRepository();

    Ticket ticket1 = new Ticket(1, 1_299, 95, "LED", "HTA");
    Ticket ticket2 = new Ticket(2, 2_199, 95, "HTA", "LED");
    Ticket ticket3 = new Ticket(3, 1_500, 60, "LED", "SVO");
    Ticket ticket4 = new Ticket(4, 3_000, 100, "UFA", "DME");
    Ticket ticket5 = new Ticket(5, 1_600, 75, "KUF", "IKT");
    Ticket ticket6 = new Ticket(6, 5_000, 150, "SVO", "IKT");

    @BeforeEach
    public void setup() {
        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);
        repo.add(ticket6);


    }

    @Test
    public void shouldAddTickets() {

        Ticket[] expected = {ticket1, ticket2, ticket3, ticket4, ticket5, ticket6};
        Ticket[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


}
