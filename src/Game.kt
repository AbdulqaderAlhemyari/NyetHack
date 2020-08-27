fun main()
{
    var healthPoints=100
    val playerName="Madrigal"
    var isBlessed=true

    when(healthPoints)
    {
        100 -> println("Madrigal is in excellent condition")
        in 90..99 -> println("Madrigal has few scratches")
        in 75..89 -> if(isBlessed){println("Madrigal has some miner wounds but is healing quite quickly")}
                        else println("Madrigal has some miner wounds")
        in 15..74 -> println("Madrigal looks pretty hurt")
        in 0..14 -> println("Madrigal is in awful condition")
    }

    println(playerName)
    println(healthPoints)
}