import unittest

from flask import json

from openapi_server.models.music_popularity_artists import MusicPopularityArtists  # noqa: E501
from openapi_server.models.music_popularity_error import MusicPopularityError  # noqa: E501
from openapi_server.models.music_popularity_playlists import MusicPopularityPlaylists  # noqa: E501
from openapi_server.models.music_popularity_tracks import MusicPopularityTracks  # noqa: E501
from openapi_server.models.personalised_music_batch_request import PersonalisedMusicBatchRequest  # noqa: E501
from openapi_server.models.personalised_music_error_response import PersonalisedMusicErrorResponse  # noqa: E501
from openapi_server.models.personalised_music_request import PersonalisedMusicRequest  # noqa: E501
from openapi_server.models.personalised_music_response import PersonalisedMusicResponse  # noqa: E501
from openapi_server.models.personalised_music_success import PersonalisedMusicSuccess  # noqa: E501
from openapi_server.test import BaseTestCase


class TestMusicController(BaseTestCase):
    """MusicController integration test stubs"""

    def test_delete_personalised_music_favourites_by_type_by_id(self):
        """Test case for delete_personalised_music_favourites_by_type_by_id

        Favourite Track or Clip
        """
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/favourites/{type}/{id}'.format(type='type_example', id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_personalised_music_follows_by_type_by_id(self):
        """Test case for delete_personalised_music_follows_by_type_by_id

        Followed Network, Category, Artist, Playlist and Genre
        """
        query_string = [('music-data', True),
                        ('music_context', 'music_context_example'),
                        ('music_within_uk', True)]
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/follows/{type}/{id}'.format(type='type_example', id='id_example'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_music_popular_artist_by_id(self):
        """Test case for get_music_popular_artist_by_id

        Single Artist Popularity
        """
        query_string = [('since', 'since_example'),
                        ('until', 'until_example'),
                        ('decomposed', True)]
        headers = { 
            'Accept': 'application/json',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/music/popular/artists/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_music_popular_artists(self):
        """Test case for get_music_popular_artists

        Popular Artists
        """
        query_string = [('since', 'since_example'),
                        ('until', 'until_example'),
                        ('decomposed', True),
                        ('offset', 56),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/music/popular/artists',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_music_popular_playlist_by_id(self):
        """Test case for get_music_popular_playlist_by_id

        Single Playlist Popularity
        """
        query_string = [('since', 'since_example'),
                        ('until', 'until_example'),
                        ('decomposed', True)]
        headers = { 
            'Accept': 'application/json',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/music/popular/playlists/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_music_popular_playlists(self):
        """Test case for get_music_popular_playlists

        Popular Playlists
        """
        query_string = [('since', 'since_example'),
                        ('until', 'until_example'),
                        ('decomposed', True),
                        ('offset', 56),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/music/popular/playlists',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_music_popular_track_by_id(self):
        """Test case for get_music_popular_track_by_id

        Single Track Popularity
        """
        query_string = [('since', 'since_example'),
                        ('until', 'until_example'),
                        ('network', 'network_example'),
                        ('programme', 'programme_example'),
                        ('artist', 'artist_example'),
                        ('decomposed', True)]
        headers = { 
            'Accept': 'application/json',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/music/popular/tracks/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_music_popular_tracks(self):
        """Test case for get_music_popular_tracks

        Popular Tracks
        """
        query_string = [('since', 'since_example'),
                        ('until', 'until_example'),
                        ('network', 'network_example'),
                        ('programme', 'programme_example'),
                        ('artist', 'artist_example'),
                        ('decomposed', True),
                        ('offset', 56),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/music/popular/tracks',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_personalised_music_favourites(self):
        """Test case for get_personalised_music_favourites

        Favourite Tracks or Clips
        """
        query_string = [('offset', 56),
                        ('limit', 56),
                        ('action', 'action_example'),
                        ('music-data', True)]
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/favourites',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_personalised_music_favourites_by_type(self):
        """Test case for get_personalised_music_favourites_by_type

        Favourite Tracks or Clips by Type
        """
        query_string = [('action', 'action_example'),
                        ('offset', 56),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/favourites/{type}'.format(type='type_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_personalised_music_favourites_by_type_by_id(self):
        """Test case for get_personalised_music_favourites_by_type_by_id

        Favourite Track or Clip
        """
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/favourites/{type}/{id}'.format(type='type_example', id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_personalised_music_follows(self):
        """Test case for get_personalised_music_follows

        Followed Networks, Categories, Artists, Playlists and Genres
        """
        query_string = [('action', 'action_example'),
                        ('music-data', True),
                        ('music_context', 'music_context_example'),
                        ('music_within_uk', True),
                        ('offset', 56),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/follows',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_personalised_music_follows_by_type(self):
        """Test case for get_personalised_music_follows_by_type

        Followed Networks, Categories, Artists, Playlists and Genres by Type
        """
        query_string = [('action', 'action_example'),
                        ('music-data', True),
                        ('music_context', 'music_context_example'),
                        ('music_within_uk', True),
                        ('offset', 56),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/follows/{type}'.format(type='type_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_personalised_music_follows_by_type_by_id(self):
        """Test case for get_personalised_music_follows_by_type_by_id

        Followed Network, Category, Artist, Playlist and Genre
        """
        query_string = [('music-data', True),
                        ('music_context', 'music_context_example'),
                        ('music_within_uk', True)]
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/follows/{type}/{id}'.format(type='type_example', id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_personalised_music_favourites_batch(self):
        """Test case for post_personalised_music_favourites_batch

        Favourite Tracks or Clips
        """
        body = {"added_at":"added_at","domain":"domain","context":"context","meta_data":{"key":"key"},"action":"action","id":"id","type":"type"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/favourites',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_personalised_music_favourites_by_type_by_id(self):
        """Test case for post_personalised_music_favourites_by_type_by_id

        Favourite Track or Clip
        """
        body = {"added_at":"added_at","context":"context","meta_data":{"key":"key"},"action":"action"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/favourites/{type}/{id}'.format(type='type_example', id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_personalised_music_follows_batch(self):
        """Test case for post_personalised_music_follows_batch

        Followed Networks, Categories, Artists, Playlists and Genres
        """
        body = {"added_at":"added_at","domain":"domain","context":"context","meta_data":{"key":"key"},"action":"action","id":"id","type":"type"}
        query_string = [('action', 'action_example'),
                        ('music-data', True),
                        ('music_context', 'music_context_example'),
                        ('music_within_uk', True)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/follows',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_personalised_music_follows_by_type_by_id(self):
        """Test case for post_personalised_music_follows_by_type_by_id

        Followed Network, Category, Artist, Playlist and Genre
        """
        body = {"added_at":"added_at","context":"context","meta_data":{"key":"key"},"action":"action"}
        query_string = [('music-data', True),
                        ('music_context', 'music_context_example'),
                        ('music_within_uk', True)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/follows/{type}/{id}'.format(type='type_example', id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_put_personalised_music_favourites_batch(self):
        """Test case for put_personalised_music_favourites_batch

        Favourite Tracks or Clips
        """
        body = {"added_at":"added_at","domain":"domain","context":"context","meta_data":{"key":"key"},"action":"action","id":"id","type":"type"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/favourites',
            method='PUT',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_put_personalised_music_favourites_by_type_by_id(self):
        """Test case for put_personalised_music_favourites_by_type_by_id

        Favourite Track or Clip
        """
        body = {"added_at":"added_at","context":"context","meta_data":{"key":"key"},"action":"action"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/favourites/{type}/{id}'.format(type='type_example', id='id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_put_personalised_music_follows_batch(self):
        """Test case for put_personalised_music_follows_batch

        Followed Networks, Categories, Artists, Playlists and Genres
        """
        body = {"added_at":"added_at","domain":"domain","context":"context","meta_data":{"key":"key"},"action":"action","id":"id","type":"type"}
        query_string = [('action', 'action_example'),
                        ('music-data', True),
                        ('music_context', 'music_context_example'),
                        ('music_within_uk', True)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/follows',
            method='PUT',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_put_personalised_music_follows_by_type_by_id(self):
        """Test case for put_personalised_music_follows_by_type_by_id

        Followed Network, Category, Artist, Playlist and Genre
        """
        body = {"added_at":"added_at","context":"context","meta_data":{"key":"key"},"action":"action"}
        query_string = [('music-data', True),
                        ('music_context', 'music_context_example'),
                        ('music_within_uk', True)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/music/follows/{type}/{id}'.format(type='type_example', id='id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
