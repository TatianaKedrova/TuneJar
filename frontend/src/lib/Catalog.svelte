<script>
   export let index, title, artist,  coverUrl, year
   export let songs = []
</script>

<style></style>



{#each songs as {CoverUrl, Title, Artist, Year}, index}
    <Song
            index={Index}
            coverUrl={CoverUrl}
            title={Title}
            artist="{Artist}"
            year={Year}
    />
    <article>
        <small>#(index)</small>
        <img> alt={songs.title} src{songs.coverUrl} />
        <h3>{songs.title}</h3>
        <h3>{songs.artist}</h3>
        <span>{songs.year}</span>
    </article>
{/each}