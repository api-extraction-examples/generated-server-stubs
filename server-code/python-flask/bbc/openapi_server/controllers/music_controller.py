import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.music_popularity_artists import MusicPopularityArtists  # noqa: E501
from openapi_server.models.music_popularity_error import MusicPopularityError  # noqa: E501
from openapi_server.models.music_popularity_playlists import MusicPopularityPlaylists  # noqa: E501
from openapi_server.models.music_popularity_tracks import MusicPopularityTracks  # noqa: E501
from openapi_server.models.personalised_music_batch_request import PersonalisedMusicBatchRequest  # noqa: E501
from openapi_server.models.personalised_music_error_response import PersonalisedMusicErrorResponse  # noqa: E501
from openapi_server.models.personalised_music_request import PersonalisedMusicRequest  # noqa: E501
from openapi_server.models.personalised_music_response import PersonalisedMusicResponse  # noqa: E501
from openapi_server.models.personalised_music_success import PersonalisedMusicSuccess  # noqa: E501
from openapi_server import util


def delete_personalised_music_favourites_by_type_by_id(authorization, x_authentication_provider, x_api_key, type, id):  # noqa: E501
    """Favourite Track or Clip

    Delete track or clip from a BBC Music user favourites.  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param type: Supported Music favourite types: Clips or Tracks
    :type type: str
    :param id: Clip PID or Track ID
    :type id: str

    :rtype: Union[PersonalisedMusicSuccess, Tuple[PersonalisedMusicSuccess, int], Tuple[PersonalisedMusicSuccess, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_personalised_music_follows_by_type_by_id(authorization, x_authentication_provider, x_api_key, type, id, music_data=None, music_context=None, music_within_uk=None):  # noqa: E501
    """Followed Network, Category, Artist, Playlist and Genre

    Remove a single network, category, artist, playlist, network, genre or service entity is in a users follows  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param type: Supported Music follows types: Playlists, Services, Genres &amp; Artists
    :type type: str
    :param id: Playlists, Services, Networks, Genres, Categories or Artists ID
    :type id: str
    :param music_data: Omits music data from the response, defaults to true
    :type music_data: bool
    :param music_context: Specify context to be passed to Music API
    :type music_context: str
    :param music_within_uk: Specify location to be passed to Music API
    :type music_within_uk: bool

    :rtype: Union[PersonalisedMusicSuccess, Tuple[PersonalisedMusicSuccess, int], Tuple[PersonalisedMusicSuccess, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_music_popular_artist_by_id(x_api_key, id, since=None, until=None, decomposed=None):  # noqa: E501
    """Single Artist Popularity

    Popularity Artist By Id  # noqa: E501

    :param x_api_key: API_KEY
    :type x_api_key: str
    :param id: MusicBrainz Id - Used to get single resource score
    :type id: str
    :param since: ISO 8601 Date yyyy-mm-dd.  Returns items between given time period and now
    :type since: str
    :param until: ISO 8601 Date yyyy-mm-dd.  Returns items between given &#39;since&#39; and &#39;until&#39; date params
    :type until: str
    :param decomposed: In addition to the overall score, return a list of scores broken down by day N.B Must be used in conjunction with since and/or until and since is &gt;&#x3D; 31 days
    :type decomposed: bool

    :rtype: Union[MusicPopularityArtists, Tuple[MusicPopularityArtists, int], Tuple[MusicPopularityArtists, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_music_popular_artists(x_api_key, since=None, until=None, decomposed=None, offset=None, limit=None):  # noqa: E501
    """Popular Artists

    List of Most Popular artists from BBC Music.  # noqa: E501

    :param x_api_key: API_KEY
    :type x_api_key: str
    :param since: ISO 8601 Date yyyy-mm-dd.  Returns items between given time period and now
    :type since: str
    :param until: ISO 8601 Date yyyy-mm-dd.  Returns items between given &#39;since&#39; and &#39;until&#39; date params
    :type until: str
    :param decomposed: In addition to the overall score, return a list of scores broken down by day N.B Must be used in conjunction with since and/or until and since is &gt;&#x3D; 31 days
    :type decomposed: bool
    :param offset: Paginated results offset
    :type offset: int
    :param limit: Paginated results limit
    :type limit: int

    :rtype: Union[MusicPopularityArtists, Tuple[MusicPopularityArtists, int], Tuple[MusicPopularityArtists, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_music_popular_playlist_by_id(x_api_key, id, since=None, until=None, decomposed=None):  # noqa: E501
    """Single Playlist Popularity

    Popular playlist by Id  # noqa: E501

    :param x_api_key: API_KEY
    :type x_api_key: str
    :param id: BBC Music Playlist Id - Used to get single resource score
    :type id: str
    :param since: ISO 8601 Date yyyy-mm-dd.  Returns items between given time period and now
    :type since: str
    :param until: ISO 8601 Date yyyy-mm-dd.  Returns items between given &#39;since&#39; and &#39;until&#39; date params
    :type until: str
    :param decomposed: In addition to the overall score, return a list of scores broken down by day N.B Must be used in conjunction with since and/or until and since is &gt;&#x3D; 31 days
    :type decomposed: bool

    :rtype: Union[MusicPopularityPlaylists, Tuple[MusicPopularityPlaylists, int], Tuple[MusicPopularityPlaylists, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_music_popular_playlists(x_api_key, since=None, until=None, decomposed=None, offset=None, limit=None):  # noqa: E501
    """Popular Playlists

    List of Most Popular playlists from BBC Music.  # noqa: E501

    :param x_api_key: API_KEY
    :type x_api_key: str
    :param since: ISO 8601 Date yyyy-mm-dd.  Returns items between given time period and now
    :type since: str
    :param until: ISO 8601 Date yyyy-mm-dd.  Returns items between given &#39;since&#39; and &#39;until&#39; date params
    :type until: str
    :param decomposed: In addition to the overall score, return a list of scores broken down by day N.B Must be used in conjunction with since and/or until and since is &gt;&#x3D; 31 days
    :type decomposed: bool
    :param offset: Paginated results offset
    :type offset: int
    :param limit: Paginated results limit
    :type limit: int

    :rtype: Union[MusicPopularityPlaylists, Tuple[MusicPopularityPlaylists, int], Tuple[MusicPopularityPlaylists, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_music_popular_track_by_id(x_api_key, id, since=None, until=None, network=None, programme=None, artist=None, decomposed=None):  # noqa: E501
    """Single Track Popularity

    Popular Track for BBC Music  # noqa: E501

    :param x_api_key: API_KEY
    :type x_api_key: str
    :param id: BBC Music Track Id - Used to get single resource score
    :type id: str
    :param since: ISO 8601 Date yyyy-mm-dd.  Returns items between given time period and now
    :type since: str
    :param until: ISO 8601 Date yyyy-mm-dd.  Returns items between given &#39;since&#39; and &#39;until&#39; date params
    :type until: str
    :param network: Return items with given Network ID
    :type network: str
    :param programme: Items with given Programme Pid
    :type programme: str
    :param artist: MusicBrainz artist ID
    :type artist: str
    :param decomposed: In addition to the overall score, return a list of scores broken down by day N.B Must be used in conjunction with since and/or until and since is &gt;&#x3D; 31 days
    :type decomposed: bool

    :rtype: Union[MusicPopularityTracks, Tuple[MusicPopularityTracks, int], Tuple[MusicPopularityTracks, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_music_popular_tracks(x_api_key, since=None, until=None, network=None, programme=None, artist=None, decomposed=None, offset=None, limit=None):  # noqa: E501
    """Popular Tracks

    List of popular tracks for BBC Music. Filter by time, network, artist, playlist or programme.  # noqa: E501

    :param x_api_key: API_KEY
    :type x_api_key: str
    :param since: ISO 8601 Date yyyy-mm-dd.  Returns items between given time period and now
    :type since: str
    :param until: ISO 8601 Date yyyy-mm-dd.  Returns items between given &#39;since&#39; and &#39;until&#39; date params
    :type until: str
    :param network: Return items with given Network ID
    :type network: str
    :param programme: Items with given Programme Pid
    :type programme: str
    :param artist: MusicBrainz artist ID
    :type artist: str
    :param decomposed: In addition to the overall score, return a list of scores broken down by day N.B Must be used in conjunction with since and/or until and since is &gt;&#x3D; 31 days
    :type decomposed: bool
    :param offset: Paginated results offset
    :type offset: int
    :param limit: Paginated results limit
    :type limit: int

    :rtype: Union[MusicPopularityTracks, Tuple[MusicPopularityTracks, int], Tuple[MusicPopularityTracks, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_personalised_music_favourites(authorization, x_authentication_provider, x_api_key, offset=None, limit=None, action=None, music_data=None):  # noqa: E501
    """Favourite Tracks or Clips

    List of favourited tracks and clips for a given user for BBC Music.  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param offset: Paginated results offset
    :type offset: int
    :param limit: Paginated results limit
    :type limit: int
    :param action: Filters activities based on the type of action
    :type action: str
    :param music_data: Omits music data from the response, defaults to true
    :type music_data: bool

    :rtype: Union[PersonalisedMusicResponse, Tuple[PersonalisedMusicResponse, int], Tuple[PersonalisedMusicResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_personalised_music_favourites_by_type(authorization, x_authentication_provider, x_api_key, type, action=None, offset=None, limit=None):  # noqa: E501
    """Favourite Tracks or Clips by Type

    List of favourited tracks or clips for a given user for BBC Music.  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param type: Supported Music favourite types: Clips or Tracks
    :type type: str
    :param action: Filters activities based on the type of action
    :type action: str
    :param offset: Paginated results offset
    :type offset: int
    :param limit: Paginated results limit
    :type limit: int

    :rtype: Union[PersonalisedMusicResponse, Tuple[PersonalisedMusicResponse, int], Tuple[PersonalisedMusicResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_personalised_music_favourites_by_type_by_id(authorization, x_authentication_provider, x_api_key, type, id):  # noqa: E501
    """Favourite Track or Clip

    Check to see if a single track or clip entity is in a users favourites - determines UX of add button.  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param type: Supported Music favourite types: Clips or Tracks
    :type type: str
    :param id: Clip PID or Track ID
    :type id: str

    :rtype: Union[PersonalisedMusicResponse, Tuple[PersonalisedMusicResponse, int], Tuple[PersonalisedMusicResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_personalised_music_follows(authorization, x_authentication_provider, x_api_key, action=None, music_data=None, music_context=None, music_within_uk=None, offset=None, limit=None):  # noqa: E501
    """Followed Networks, Categories, Artists, Playlists and Genres

    List of followed networks, categories, artists, playlists and genres for a given user for BBC Music.  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param action: Filters activities based on the type of action
    :type action: str
    :param music_data: Omits music data from the response, defaults to true
    :type music_data: bool
    :param music_context: Specify context to be passed to Music API
    :type music_context: str
    :param music_within_uk: Specify location to be passed to Music API
    :type music_within_uk: bool
    :param offset: Paginated results offset
    :type offset: int
    :param limit: Paginated results limit
    :type limit: int

    :rtype: Union[PersonalisedMusicResponse, Tuple[PersonalisedMusicResponse, int], Tuple[PersonalisedMusicResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_personalised_music_follows_by_type(authorization, x_authentication_provider, x_api_key, type, action=None, music_data=None, music_context=None, music_within_uk=None, offset=None, limit=None):  # noqa: E501
    """Followed Networks, Categories, Artists, Playlists and Genres by Type

    List of followed networks, categories, artists, playlists, networks, genres, categories or services for a given BBC Music user.  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param type: Supported Music follows types: Playlists, Services, Genres &amp; Artists
    :type type: str
    :param action: Filters activities based on the type of action
    :type action: str
    :param music_data: Omits music data from the response, defaults to true
    :type music_data: bool
    :param music_context: Specify context to be passed to Music API
    :type music_context: str
    :param music_within_uk: Specify location to be passed to Music API
    :type music_within_uk: bool
    :param offset: Paginated results offset
    :type offset: int
    :param limit: Paginated results limit
    :type limit: int

    :rtype: Union[PersonalisedMusicResponse, Tuple[PersonalisedMusicResponse, int], Tuple[PersonalisedMusicResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_personalised_music_follows_by_type_by_id(authorization, x_authentication_provider, x_api_key, type, id, music_data=None, music_context=None, music_within_uk=None):  # noqa: E501
    """Followed Network, Category, Artist, Playlist and Genre

    Check to see if a single network, category, artist, playlist, network, genre or service entity is in a users follows - determines UX of add button.  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param type: Supported Music follows types: Playlists, Services, Genres &amp; Artists
    :type type: str
    :param id: Playlists, Services, Networks, Genres, Categories or Artists ID
    :type id: str
    :param music_data: Omits music data from the response, defaults to true
    :type music_data: bool
    :param music_context: Specify context to be passed to Music API
    :type music_context: str
    :param music_within_uk: Specify location to be passed to Music API
    :type music_within_uk: bool

    :rtype: Union[PersonalisedMusicResponse, Tuple[PersonalisedMusicResponse, int], Tuple[PersonalisedMusicResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def post_personalised_music_favourites_batch(authorization, x_authentication_provider, x_api_key, body):  # noqa: E501
    """Favourite Tracks or Clips

    Add multiple tracks and/or clips to a BBC Music user&#39;s favourites.  N.B. Any HTML tags submitted in metadata will be removed  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param body: Action favourited or unfavourited
    :type body: list | bytes

    :rtype: Union[PersonalisedMusicResponse, Tuple[PersonalisedMusicResponse, int], Tuple[PersonalisedMusicResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = [PersonalisedMusicBatchRequest.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def post_personalised_music_favourites_by_type_by_id(authorization, x_authentication_provider, x_api_key, type, id, body):  # noqa: E501
    """Favourite Track or Clip

    Add track or clip to a BBC Music user favourites.  N.B. Any HTML tags submitted in metadata will be removed  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param type: Supported Music favourite types: Clips or Tracks
    :type type: str
    :param id: Clip PID or Track ID
    :type id: str
    :param body: Action favourited or unfavourited
    :type body: dict | bytes

    :rtype: Union[PersonalisedMusicResponse, Tuple[PersonalisedMusicResponse, int], Tuple[PersonalisedMusicResponse, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = PersonalisedMusicRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def post_personalised_music_follows_batch(authorization, x_authentication_provider, x_api_key, body, action=None, music_data=None, music_context=None, music_within_uk=None):  # noqa: E501
    """Followed Networks, Categories, Artists, Playlists and Genres

    Add networks, categories, artists, playlists, networks, genres or services in a users follows  N.B. Any HTML tags submitted in metadata will be removed  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param body: Action followed or unfollowed
    :type body: list | bytes
    :param action: Filters activities based on the type of action
    :type action: str
    :param music_data: Omits music data from the response, defaults to true
    :type music_data: bool
    :param music_context: Specify context to be passed to Music API
    :type music_context: str
    :param music_within_uk: Specify location to be passed to Music API
    :type music_within_uk: bool

    :rtype: Union[PersonalisedMusicSuccess, Tuple[PersonalisedMusicSuccess, int], Tuple[PersonalisedMusicSuccess, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = [PersonalisedMusicBatchRequest.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def post_personalised_music_follows_by_type_by_id(authorization, x_authentication_provider, x_api_key, type, id, body, music_data=None, music_context=None, music_within_uk=None):  # noqa: E501
    """Followed Network, Category, Artist, Playlist and Genre

    Add a single network, category, artist, playlist, network, genre or service entity is in a users follows  N.B. Any HTML tags submitted in metadata will be removed  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param type: Supported Music follows types: Playlists, Services, Genres &amp; Artists
    :type type: str
    :param id: Playlists, Services, Networks, Genres, Categories or Artists ID
    :type id: str
    :param body: Action followed or unfollowed
    :type body: dict | bytes
    :param music_data: Omits music data from the response, defaults to true
    :type music_data: bool
    :param music_context: Specify context to be passed to Music API
    :type music_context: str
    :param music_within_uk: Specify location to be passed to Music API
    :type music_within_uk: bool

    :rtype: Union[PersonalisedMusicSuccess, Tuple[PersonalisedMusicSuccess, int], Tuple[PersonalisedMusicSuccess, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = PersonalisedMusicRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def put_personalised_music_favourites_batch(authorization, x_authentication_provider, x_api_key, body):  # noqa: E501
    """Favourite Tracks or Clips

    Update tracks or clips from a BBC Music user favourites.  N.B. Any HTML tags submitted in metadata will be removed  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param body: Action favourited or unfavourited
    :type body: list | bytes

    :rtype: Union[PersonalisedMusicSuccess, Tuple[PersonalisedMusicSuccess, int], Tuple[PersonalisedMusicSuccess, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = [PersonalisedMusicBatchRequest.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def put_personalised_music_favourites_by_type_by_id(authorization, x_authentication_provider, x_api_key, type, id, body):  # noqa: E501
    """Favourite Track or Clip

    Update tracks or clips from a BBC Music user favourites.  N.B. Any HTML tags submitted in metadata will be removed  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param type: Supported Music favourite types: Clips or Tracks
    :type type: str
    :param id: Clip PID or Track ID
    :type id: str
    :param body: Action favourited or unfavourited
    :type body: dict | bytes

    :rtype: Union[PersonalisedMusicSuccess, Tuple[PersonalisedMusicSuccess, int], Tuple[PersonalisedMusicSuccess, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = PersonalisedMusicRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def put_personalised_music_follows_batch(authorization, x_authentication_provider, x_api_key, body, action=None, music_data=None, music_context=None, music_within_uk=None):  # noqa: E501
    """Followed Networks, Categories, Artists, Playlists and Genres

    Update networks, categories, artists, playlists, networks, genres or services in a users follows  N.B. Any HTML tags submitted in metadata will be removed  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param body: Action followed or unfollowed
    :type body: list | bytes
    :param action: Filters activities based on the type of action
    :type action: str
    :param music_data: Omits music data from the response, defaults to true
    :type music_data: bool
    :param music_context: Specify context to be passed to Music API
    :type music_context: str
    :param music_within_uk: Specify location to be passed to Music API
    :type music_within_uk: bool

    :rtype: Union[PersonalisedMusicSuccess, Tuple[PersonalisedMusicSuccess, int], Tuple[PersonalisedMusicSuccess, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = [PersonalisedMusicBatchRequest.from_dict(d) for d in connexion.request.get_json()]  # noqa: E501
    return 'do some magic!'


def put_personalised_music_follows_by_type_by_id(authorization, x_authentication_provider, x_api_key, type, id, body, music_data=None, music_context=None, music_within_uk=None):  # noqa: E501
    """Followed Network, Category, Artist, Playlist and Genre

    Update a single network, category, artist, playlist, network, genre or service entity is in a users follows  N.B. Any HTML tags submitted in metadata will be removed  # noqa: E501

    :param authorization: Bearer OAUTH_TOKEN
    :type authorization: str
    :param x_authentication_provider: Authentication type
    :type x_authentication_provider: str
    :param x_api_key: API_KEY
    :type x_api_key: str
    :param type: Supported Music follows types: Playlists, Services, Genres &amp; Artists
    :type type: str
    :param id: Playlists, Services, Networks, Genres, Categories or Artists ID
    :type id: str
    :param body: Action followed or unfollowed
    :type body: dict | bytes
    :param music_data: Omits music data from the response, defaults to true
    :type music_data: bool
    :param music_context: Specify context to be passed to Music API
    :type music_context: str
    :param music_within_uk: Specify location to be passed to Music API
    :type music_within_uk: bool

    :rtype: Union[PersonalisedMusicSuccess, Tuple[PersonalisedMusicSuccess, int], Tuple[PersonalisedMusicSuccess, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        body = PersonalisedMusicRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
