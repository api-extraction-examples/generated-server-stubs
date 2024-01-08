import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.hook import Hook  # noqa: E501
from openapi_server.test import BaseTestCase


class TestHookController(BaseTestCase):
    """HookController integration test stubs"""

    def test_create_hook_by_site_id(self):
        """Test case for create_hook_by_site_id

        
        """
        hook = openapi_server.Hook()
        query_string = [('site_id', 'site_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/hooks',
            method='POST',
            headers=headers,
            data=json.dumps(hook),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_hook(self):
        """Test case for delete_hook

        
        """
        headers = { 
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/hooks/{hook_id}'.format(hook_id='hook_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_enable_hook(self):
        """Test case for enable_hook

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/hooks/{hook_id}/enable'.format(hook_id='hook_id_example'),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_hook(self):
        """Test case for get_hook

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/hooks/{hook_id}'.format(hook_id='hook_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_hooks_by_site_id(self):
        """Test case for list_hooks_by_site_id

        
        """
        query_string = [('site_id', 'site_id_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/hooks',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_hook(self):
        """Test case for update_hook

        
        """
        hook = openapi_server.Hook()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/hooks/{hook_id}'.format(hook_id='hook_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(hook),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
