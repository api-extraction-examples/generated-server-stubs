import unittest

from flask import json

from openapi_server.models.add_field_bean import AddFieldBean  # noqa: E501
from openapi_server.models.move_field_bean import MoveFieldBean  # noqa: E501
from openapi_server.models.screenable_field import ScreenableField  # noqa: E501
from openapi_server.test import BaseTestCase


class TestScreenTabFieldsController(BaseTestCase):
    """ScreenTabFieldsController integration test stubs"""

    def test_add_screen_tab_field(self):
        """Test case for add_screen_tab_field

        Add screen tab field
        """
        add_field_bean = {"fieldId":"fieldId"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/screens/{screen_id}/tabs/{tab_id}/fields'.format(screen_id=56, tab_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(add_field_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_screen_tab_fields(self):
        """Test case for get_all_screen_tab_fields

        Get all screen tab fields
        """
        query_string = [('projectKey', 'project_key_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/screens/{screen_id}/tabs/{tab_id}/fields'.format(screen_id=56, tab_id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_move_screen_tab_field(self):
        """Test case for move_screen_tab_field

        Move screen tab field
        """
        move_field_bean = {"after":"https://openapi-generator.tech","position":"Earlier"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/screens/{screen_id}/tabs/{tab_id}/fields/{id}/move'.format(screen_id=56, tab_id=56, id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(move_field_bean),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_screen_tab_field(self):
        """Test case for remove_screen_tab_field

        Remove screen tab field
        """
        headers = { 
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/screens/{screen_id}/tabs/{tab_id}/fields/{id}'.format(screen_id=56, tab_id=56, id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
