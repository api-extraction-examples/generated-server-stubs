import unittest

from flask import json

from openapi_server.models.base_item_dto import BaseItemDto  # noqa: E501
from openapi_server.models.base_item_dto_query_result import BaseItemDtoQueryResult  # noqa: E501
from openapi_server.models.image_type import ImageType  # noqa: E501
from openapi_server.models.item_fields import ItemFields  # noqa: E501
from openapi_server.models.user_item_data_dto import UserItemDataDto  # noqa: E501
from openapi_server.test import BaseTestCase


class TestUserLibraryController(BaseTestCase):
    """UserLibraryController integration test stubs"""

    def test_delete_user_item_rating(self):
        """Test case for delete_user_item_rating

        Deletes a user's saved personal rating for an item.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/{user_id}/Items/{item_id}/Rating'.format(user_id='user_id_example', item_id='item_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_intros(self):
        """Test case for get_intros

        Gets intros to play before the main media item plays.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/{user_id}/Items/{item_id}/Intros'.format(user_id='user_id_example', item_id='item_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_item(self):
        """Test case for get_item

        Gets an item from a user's library.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/{user_id}/Items/{item_id}'.format(user_id='user_id_example', item_id='item_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_latest_media(self):
        """Test case for get_latest_media

        Gets latest media.
        """
        query_string = [('parentId', 'parent_id_example'),
                        ('fields', [openapi_server.ItemFields()]),
                        ('includeItemTypes', ['include_item_types_example']),
                        ('isPlayed', True),
                        ('enableImages', True),
                        ('imageTypeLimit', 56),
                        ('enableImageTypes', [openapi_server.ImageType()]),
                        ('enableUserData', True),
                        ('limit', 20),
                        ('groupItems', True)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/{user_id}/Items/Latest'.format(user_id='user_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_local_trailers(self):
        """Test case for get_local_trailers

        Gets local trailers for an item.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/{user_id}/Items/{item_id}/LocalTrailers'.format(user_id='user_id_example', item_id='item_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_root_folder(self):
        """Test case for get_root_folder

        Gets the root folder from a user's library.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/{user_id}/Items/Root'.format(user_id='user_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_special_features(self):
        """Test case for get_special_features

        Gets special features for an item.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/{user_id}/Items/{item_id}/SpecialFeatures'.format(user_id='user_id_example', item_id='item_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_mark_favorite_item(self):
        """Test case for mark_favorite_item

        Marks an item as a favorite.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/{user_id}/FavoriteItems/{item_id}'.format(user_id='user_id_example', item_id='item_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_unmark_favorite_item(self):
        """Test case for unmark_favorite_item

        Unmarks item as a favorite.
        """
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/{user_id}/FavoriteItems/{item_id}'.format(user_id='user_id_example', item_id='item_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_user_item_rating(self):
        """Test case for update_user_item_rating

        Updates a user's rating for an item.
        """
        query_string = [('likes', True)]
        headers = { 
            'Accept': 'application/json',
            'CustomAuthentication': 'special-key',
        }
        response = self.client.open(
            '/Users/{user_id}/Items/{item_id}/Rating'.format(user_id='user_id_example', item_id='item_id_example'),
            method='POST',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
