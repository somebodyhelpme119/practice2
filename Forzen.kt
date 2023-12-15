class Forzen {
    fun order1() {
        println("[Frozen custard]")
        println("1.Shakes")
        println("2.Shake of the Week")
        println("3. Red Bean Shake")

    when (readln().toInt()) {
        1-> Shakes().order1()
        2-> ShakeoftheWeek().order1()
        3-> RedBeanShake().order1()
        0 -> { println("뒤로 가기")
        KioskStarter().start()
        }
    }
    }

}