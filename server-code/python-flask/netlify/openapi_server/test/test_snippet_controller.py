import unittest

from flask import json

from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.snippet import Snippet  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSnippetController(BaseTestCase):
    """SnippetController integration test stubs"""

    def test_create_site_snippet(self):
        """Test case for create_site_snippet

        
        """
        snippet = openapi_server.Snippet()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/snippets'.format(site_id='site_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(snippet),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_site_snippet(self):
        """Test case for delete_site_snippet

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/snippets/{snippet_id}'.format(site_id='site_id_example', snippet_id='snippet_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_site_snippet(self):
        """Test case for get_site_snippet

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/snippets/{snippet_id}'.format(site_id='site_id_example', snippet_id='snippet_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_list_site_snippets(self):
        """Test case for list_site_snippets

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/snippets'.format(site_id='site_id_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_site_snippet(self):
        """Test case for update_site_snippet

        
        """
        snippet = openapi_server.Snippet()
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/api/v1/sites/{site_id}/snippets/{snippet_id}'.format(site_id='site_id_example', snippet_id='snippet_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(snippet),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
