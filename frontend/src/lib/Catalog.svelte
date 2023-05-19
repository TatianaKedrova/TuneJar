
<script>
        import Song from "./Song.svelte";
        export let songs;

</script>


<style></style>

<section>
    <Song/>
    <div class="songs-list">
        <h3 class="catalog">Catalog</h3>
        {#each songs as info}
            <Song song={info}/>
        {/each}
    </div>
</section>

