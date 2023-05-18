<script>
    import {onMount} from "svelte";
    import Header from "./lib/Header.svelte";
    import Catalog from "./lib/Catalog.svelte";

    const file = "src/App.svelte";

    let songs = []

    onMount(() => {
        fetch("http://localhost:8081/songs")
            .then(respuesta => respuesta.json())
            .then(datos => songs = datos)
    })
</script>



<div>
    <Header/>
    <Catalog/>
    <!--<Catalog songs={songs}/>-->
</div>

<style>
    div{
        width: 100%;
        height: 100vh;
        background-color: #202334;
    }
</style>



