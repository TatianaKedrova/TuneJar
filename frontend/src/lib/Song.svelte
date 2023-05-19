<script>
    export let song;
</script>

<section>

    <div class="card">
    <img src={song.coverUrl} alt="CoverUrl">
    <p>{song.title}</p>
    <p>{song.author}</p>
    <p>{song.genre}</p>
    <p>{song.releaseYear}</p>
    </div>
</section>

<style>



    img {
        width: 250px;
    }

    p {
        color: white;
        font-weight: 400;
        font-size: 1em;
        text-align: center;
        line-height: 0.1em;
    }

    .card{
        display: flex;
        flex-direction: column;
        justify-content: center;

        width: 300px;
        height: 420px;

        padding: 20px 28px;
        margin: 10px 60px;
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