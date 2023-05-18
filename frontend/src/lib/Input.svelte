<script>


    let value = ''
    let response = []
    let loading = false

    const handleInput = (event) =>
        value = event.target.value


    /*$: if (value.length > 2) {
        console.log(value)
        fetch(`http://localhost:8081E${value}/songs`)


        fetch(`http://img.omdbapi.com/?s=${value}&apikey=422350ff`)
            .then(res => res.json())
            .then(apiResponse => {
                response = apiResponse.Search || []
                loading = false

            })
    }*/

</script>

<input
        placeholder="Search songs..."
        value={value}
        on:input={handleInput}
/>



<!--{#if loading}
    <strong>Loading...</strong>
    {:else}
    {#each response as {CoverUrl, Title, Artist, Year}, index}
        <Song
            index={index}
            coverUrl={CoverUrl}
            title={Title}
            artist="{Artist}"
            year={Year}
            />
        <article>
            <small>#(index)</small>
            <img> alt={song.Title} src{song.Poster} />
            <h3>{song.Title}</h3>
            <span>{song.Year}</span>
        </article>
        {:else}
        <strong>No exist results</strong>
    {/each}
{/if}-->







