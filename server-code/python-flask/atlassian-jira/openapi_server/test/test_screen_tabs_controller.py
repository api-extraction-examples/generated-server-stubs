import unittest

from flask import json

from openapi_server.models.screenable_tab import ScreenableTab  # noqa: E501
from openapi_server.test import BaseTestCase


class TestScreenTabsController(BaseTestCase):
    """ScreenTabsController integration test stubs"""

    def test_add_screen_tab(self):
        """Test case for add_screen_tab

        Create screen tab
        """
        screenable_tab = {"name":"name","id":0}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/screens/{screen_id}/tabs'.format(screen_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(screenable_tab),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_screen_tab(self):
        """Test case for delete_screen_tab

        Delete screen tab
        """
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/screens/{screen_id}/tabs/{tab_id}'.format(screen_id=56, tab_id=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_screen_tabs(self):
        """Test case for get_all_screen_tabs

        Get all screen tabs
        """
        query_string = [('projectKey', 'project_key_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/screens/{screen_id}/tabs'.format(screen_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_move_screen_tab(self):
        """Test case for move_screen_tab

        Move screen tab
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/screens/{screen_id}/tabs/{tab_id}/move/{pos}'.format(screen_id=56, tab_id=56, pos=56),
            method='POST',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_rename_screen_tab(self):
        """Test case for rename_screen_tab

        Update screen tab
        """
        screenable_tab = {"name":"name","id":0}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/screens/{screen_id}/tabs/{tab_id}'.format(screen_id=56, tab_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(screenable_tab),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
