<script>
    import {onMount} from "svelte";
    import Header from "./components/header.svelte"

    let songs = []

    onMount(() => {
        fetch("http://localhost:8081/songs")
            .then(respuesta => respuesta.json())
            .then(datos => songs = datos)
    })
</script>





<div class="container">
    <Header/>
    <!--<Catalog songs={songs}/>-->
</div>

<style>
    .container{
        width: 100%;
        height: 100vh;
        background-color: #202334;
    }
</style>



