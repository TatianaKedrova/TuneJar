<script>
    import {onMount} from "svelte";

    let songs = []

    onMount(() => {
        fetch("http://localhost:8081/songs")
            .then(respuesta => respuesta.json())
            .then(datos => songs = datos)
            console.log(songs)
    })
</script>


<div class="row">
    <div class="col">
        <h1>My playlist</h1>
    </div>

    <div class="col">
        <div class="card card 1">
        </div>
        <div class="card card 2">
        </div>
        <div class="card card 3">
        </div>
        <div class="card card 4">
        </div>
    </div>
</div>


<style>
    .row {
        display: flex;
        height: 88%;
        align-items: center;
        color: pink;
    }

    .col{
        flex-basis: 50%;
    }

    .card{
        width: 200px;
        height: 230px;
        padding: 15px 25px;
        margin: 10px 60px;
        box-sizing: border-box;

        display: inline-block;

        border-radius: 10px;
        background-color: #11152B;
        opacity: 0.3;
        cursor: pointer;

        transition: transform 0.3s;
    }

    .card:hover{
        transform: translateY(-10px);
    }


</style>

