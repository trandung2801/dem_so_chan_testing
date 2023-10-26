import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class dem_so_chanTestDongDuLieu {

    //Variable n
    // 0 1(T)
    @Test
    void testCase1() {
        main demSoChan = new main();
        assertEquals(0, demSoChan.dem_so_chan(-3));
    }
    // 0 1(F)
    // 0 1(F)
    @Test
    void testCase2() {
        main demSoChan = new main();
        assertEquals(1, demSoChan.dem_so_chan(0));
    }
    // 0 1(T)
    // 0 1(T)
    // 0 1(F)

    //Variable count
    // 5 6(T) 7(T)

    //Variable i:
    // 0 1(T)
    // 0 1(F)
    // 0 1(T)
    // 0 1(F)
    // 0 1(T)
    // 0 1(F)
    // 0 1(T)
    // 0 1(F)
    @Test
    void testCase3() {
        main demSoChan = new main();
        assertEquals(2, demSoChan.dem_so_chan(3));
    }







}