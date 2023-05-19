<!--<script>


    let value = ''
    let response = []
    let loading = false

    const handleInput = (event) =>
        value = event.target.value

    $: if (value.length > 2) {
           console.log(value)
           fetch(`http://localhost:8081${value}/songs`)
               .then(res => res.json())
               .then(apiResponse => {
                   response = apiResponse.Search || []
                   loading = false
               })
       }

</script>

<input
        placeholder="Search songs..."
        value={value}
        on:input={handleInput}
/>


{#if loading}
    <strong>Loading...</strong>
    {:else}
    {#each response as {coverUrl, title, artist, year}, index}
        {:else}
        <strong>No exist results</strong>
    {/each}
{/if}-->





