import unittest

from flask import json

from openapi_server.models.build_hook import BuildHook  # noqa: E501
from openapi_server.models.build_hook_setup import BuildHookSetup  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBuildHookController(BaseTestCase):
    """BuildHookController integration test stubs"""

    def test_create_site_build_hook(self):
        """Test case for create_site_build_hook

        
        """
        build_hook = openapi_server.BuildHookSetup()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/build_hooks'.format(site_id='site_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(build_hook),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_site_build_hook(self):
        """Test case for delete_site_build_hook

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/build_hooks/{id}'.format(site_id='site_id_example', id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_site_build_hook(self):
        """Test case for get_site_build_hook

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/build_hooks/{id}'.format(site_id='site_id_example', id='id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_site_build_hooks(self):
        """Test case for list_site_build_hooks

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/build_hooks'.format(site_id='site_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_site_build_hook(self):
        """Test case for update_site_build_hook

        
        """
        build_hook = openapi_server.BuildHookSetup()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/build_hooks/{id}'.format(site_id='site_id_example', id='id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(build_hook),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
