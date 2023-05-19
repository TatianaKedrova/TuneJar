<script>
    import Heart from "./Heart.svelte";
    import Header from "./Header.svelte";
    export let song;
</script>

<section>
    <div class="card">
            <img src={song.coverUrl} alt="CoverUrl">
            <p>{song.title}</p>
            <p>{song.author}</p>
            <p>{song.genre}</p>
            <p>{song.releaseYear}</p>
        <Heart/>
    </div>
</section>

<style>
    img {
        width: 150px;
    }

    p {
        color: white;
        font-weight: 400;
        font-size: 1em;
        text-align: center;
        line-height: 0.7em;
    }

    .card{
        margin: 10px 10px;
        padding: 20px 28px;

        width: 200px;
        height: 320px;

        box-sizing: border-box;

        border-radius: 10px;
        background-color: #11152B;

        cursor: pointer;
        transition: transform 0.3s;
    }

    .card:hover{
        transform: translateY(-10px);
    }

</style>