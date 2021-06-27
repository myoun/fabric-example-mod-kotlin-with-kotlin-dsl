package net.fabricmc.example

@Suppress("unused")
fun init() {
    // This code runs as soon as Minecraft is in a mod-load-ready state.
    // However, some things (like resources) may still be uninitialized.
    // Proceed with mild caution.

    // You can use this if you change main entrypoint to "net.fabricmc.example.FunctionStyleInitializerKt::init"
    // https://github.com/natanfudge/fabric-example-mod-kotlin/blob/1.17/src/main/resources/fabric.mod.json

    println("Hello Fabric world!")
}