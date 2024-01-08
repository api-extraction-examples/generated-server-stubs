import unittest

from flask import json

from openapi_server.models.base_item_dto_query_result import BaseItemDtoQueryResult  # noqa: E501
from openapi_server.models.image_type import ImageType  # noqa: E501
from openapi_server.models.item_fields import ItemFields  # noqa: E501
from openapi_server.test import BaseTestCase


class TestInstantMixController(BaseTestCase):
    """InstantMixController integration test stubs"""

    def test_get_instant_mix_from_album(self):
        """Test case for get_instant_mix_from_album

        Creates an instant playlist based on a given song.
        """
        query_string = [('userId', 'user_id_example'),
                        ('limit', 56),
                        ('fields', [openapi_server.ItemFields()]),
                        ('enableImages', True),
                        ('enableUserData', True),
                        ('imageTypeLimit', 56),
                        ('enableImageTypes', [openapi_server.ImageType()])]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Albums/{id}/InstantMix'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_instant_mix_from_artists(self):
        """Test case for get_instant_mix_from_artists

        Creates an instant playlist based on a given song.
        """
        query_string = [('userId', 'user_id_example'),
                        ('limit', 56),
                        ('fields', [openapi_server.ItemFields()]),
                        ('enableImages', True),
                        ('enableUserData', True),
                        ('imageTypeLimit', 56),
                        ('enableImageTypes', [openapi_server.ImageType()])]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Artists/{id}/InstantMix'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_instant_mix_from_item(self):
        """Test case for get_instant_mix_from_item

        Creates an instant playlist based on a given song.
        """
        query_string = [('userId', 'user_id_example'),
                        ('limit', 56),
                        ('fields', [openapi_server.ItemFields()]),
                        ('enableImages', True),
                        ('enableUserData', True),
                        ('imageTypeLimit', 56),
                        ('enableImageTypes', [openapi_server.ImageType()])]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Items/{id}/InstantMix'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_instant_mix_from_music_genre(self):
        """Test case for get_instant_mix_from_music_genre

        Creates an instant playlist based on a given song.
        """
        query_string = [('userId', 'user_id_example'),
                        ('limit', 56),
                        ('fields', [openapi_server.ItemFields()]),
                        ('enableImages', True),
                        ('enableUserData', True),
                        ('imageTypeLimit', 56),
                        ('enableImageTypes', [openapi_server.ImageType()])]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/MusicGenres/{name}/InstantMix'.format(name='name_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_instant_mix_from_music_genres(self):
        """Test case for get_instant_mix_from_music_genres

        Creates an instant playlist based on a given song.
        """
        query_string = [('userId', 'user_id_example'),
                        ('limit', 56),
                        ('fields', [openapi_server.ItemFields()]),
                        ('enableImages', True),
                        ('enableUserData', True),
                        ('imageTypeLimit', 56),
                        ('enableImageTypes', [openapi_server.ImageType()])]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/MusicGenres/{id}/InstantMix'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_instant_mix_from_playlist(self):
        """Test case for get_instant_mix_from_playlist

        Creates an instant playlist based on a given song.
        """
        query_string = [('userId', 'user_id_example'),
                        ('limit', 56),
                        ('fields', [openapi_server.ItemFields()]),
                        ('enableImages', True),
                        ('enableUserData', True),
                        ('imageTypeLimit', 56),
                        ('enableImageTypes', [openapi_server.ImageType()])]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Playlists/{id}/InstantMix'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_instant_mix_from_song(self):
        """Test case for get_instant_mix_from_song

        Creates an instant playlist based on a given song.
        """
        query_string = [('userId', 'user_id_example'),
                        ('limit', 56),
                        ('fields', [openapi_server.ItemFields()]),
                        ('enableImages', True),
                        ('enableUserData', True),
                        ('imageTypeLimit', 56),
                        ('enableImageTypes', [openapi_server.ImageType()])]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Songs/{id}/InstantMix'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
