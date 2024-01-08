import unittest

from flask import json

from openapi_server.models.avatar import Avatar  # noqa: E501
from openapi_server.models.avatars import Avatars  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.system_avatars import SystemAvatars  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAvatarsController(BaseTestCase):
    """AvatarsController integration test stubs"""

    def test_delete_avatar(self):
        """Test case for delete_avatar

        Delete avatar
        """
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/universal_avatar/type/{type}/owner/{owning_object_id}/avatar/{id}'.format(type='type_example', owning_object_id='owning_object_id_example', id=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_system_avatars(self):
        """Test case for get_all_system_avatars

        Get system avatars by type
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/avatar/{type}/system'.format(type='project'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_avatar_image_by_id(self):
        """Test case for get_avatar_image_by_id

        Get avatar image by ID
        """
        query_string = [('size', 'size_example'),
                        ('format', 'format_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/universal_avatar/view/type/{type}/avatar/{id}'.format(type='type_example', id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_avatar_image_by_owner(self):
        """Test case for get_avatar_image_by_owner

        Get avatar image by owner
        """
        query_string = [('size', 'size_example'),
                        ('format', 'format_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/universal_avatar/view/type/{type}/owner/{entity_id}'.format(type='type_example', entity_id='entity_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_avatar_image_by_type(self):
        """Test case for get_avatar_image_by_type

        Get avatar image by type
        """
        query_string = [('size', 'size_example'),
                        ('format', 'format_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/universal_avatar/view/type/{type}'.format(type='type_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_avatars(self):
        """Test case for get_avatars

        Get avatars
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/universal_avatar/type/{type}/owner/{entity_id}'.format(type='type_example', entity_id='entity_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    @unittest.skip("*/* not supported by Connexion. Use application/json instead. See https://github.com/zalando/connexion/pull/760")
    def test_store_avatar(self):
        """Test case for store_avatar

        Load avatar
        """
        body = None
        query_string = [('x', 0),
                        ('y', 0),
                        ('size', 56)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/universal_avatar/type/{type}/owner/{entity_id}'.format(type='type_example', entity_id='entity_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
