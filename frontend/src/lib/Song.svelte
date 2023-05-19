<script>
    export let song;
</script>

<section>
    <img src={song.coverUrl} alt="CoverUrl">
    <p>{song.title}</p>
    <p>{song.author}</p>
    <p>{song.genre}</p>
    <p>{song.releaseYear}</p>
</section>


