ArrayList<Integer> result = PerfectSquares.getPerfectSquares(input);

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(9);
        expected.add(16);

        assertEquals(expected, result);
    }
}

