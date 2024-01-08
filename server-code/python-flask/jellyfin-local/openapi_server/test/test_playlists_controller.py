import unittest

from flask import json

from openapi_server.models.base_item_dto_query_result import BaseItemDtoQueryResult  # noqa: E501
from openapi_server.models.create_playlist_dto import CreatePlaylistDto  # noqa: E501
from openapi_server.models.image_type import ImageType  # noqa: E501
from openapi_server.models.item_fields import ItemFields  # noqa: E501
from openapi_server.models.playlist_creation_result import PlaylistCreationResult  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPlaylistsController(BaseTestCase):
    """PlaylistsController integration test stubs"""

    def test_add_to_playlist(self):
        """Test case for add_to_playlist

        Adds items to a playlist.
        """
        query_string = [('ids', ['ids_example']),
                        ('userId', 'user_id_example')]
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Playlists/{playlist_id}/Items'.format(playlist_id='playlist_id_example'),
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("Connexion does not support multiple consumes. See https://github.com/zalando/connexion/pull/760")
    def test_create_playlist(self):
        """Test case for create_playlist

        Creates a new playlist.
        """
        create_playlist_dto = {"UserId":"046b6c7f-0b8a-43b9-b35d-6489e6daee91","Ids":["046b6c7f-0b8a-43b9-b35d-6489e6daee91","046b6c7f-0b8a-43b9-b35d-6489e6daee91"],"MediaType":"MediaType","Name":"Name"}
        query_string = [('name', 'name_example'),
                        ('ids', ['ids_example']),
                        ('userId', 'user_id_example'),
                        ('mediaType', 'media_type_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/*+json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Playlists',
            method='POST',
            headers=headers,
            data=json.dumps(create_playlist_dto),
            content_type='application/*+json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_playlist_items(self):
        """Test case for get_playlist_items

        Gets the original items of a playlist.
        """
        query_string = [('userId', 'user_id_example'),
                        ('startIndex', 56),
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
            '/Playlists/{playlist_id}/Items'.format(playlist_id='playlist_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_move_item(self):
        """Test case for move_item

        Moves a playlist item.
        """
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Playlists/{playlist_id}/Items/{item_id}/Move/{new_index}'.format(playlist_id='playlist_id_example', item_id='item_id_example', new_index=56),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_from_playlist(self):
        """Test case for remove_from_playlist

        Removes items from a playlist.
        """
        query_string = [('entryIds', ['entry_ids_example'])]
        headers = { 
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Playlists/{playlist_id}/Items'.format(playlist_id='playlist_id_example'),
            method='DELETE',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
