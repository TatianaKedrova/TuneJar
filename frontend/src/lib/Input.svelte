<script>

    import Catalog from "./Catalog.svelte";

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

<Catalog/>

{#if loading}
    <strong>Loading...</strong>
    {:else}
    {#each response as {CoverUrl, Title, Artist, Year}, index}
        {:else}
        <strong>No exist results</strong>
    {/each}
{/if}







