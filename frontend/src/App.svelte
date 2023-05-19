<script>
    import {onMount} from "svelte";
    import Header from "./lib/Header.svelte";
    import Catalog from "./lib/Catalog.svelte";


   export let songs = []

    onMount(() => {
        fetch("http://localhost:8081/songs")
            .then(respuesta => respuesta.json())
            .then(datos => songs = datos)
    })
</script>


<section>
    <Header/>
    <Catalog songs={songs}/>
</section>


<style>
    section{
        width: 100%;
        height: 100vh;
        background-color: #202334;
    }
</style>




