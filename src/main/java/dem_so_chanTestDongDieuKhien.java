import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class dem_so_chanTestDongDieuKhien {
    @Test
    void testCase1() {
        main demSoChan = new main();
        assertEquals(0, demSoChan.dem_so_chan(-1));
    }

    @Test
    void testCase2() {
        main demSoChan = new main();
        assertEquals(1, demSoChan.dem_so_chan(0));
    }

    @Test
    void testCase3() {
        main demSoChan = new main();
        assertEquals(1, demSoChan.dem_so_chan(1));
    }

    @Test
    void testCase4() {
        main demSoChan = new main();
        assertEquals(2, demSoChan.dem_so_chan(3));
    }

}