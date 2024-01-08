import unittest

from flask import json

from openapi_server.models.page_bean_screen_scheme import PageBeanScreenScheme  # noqa: E501
from openapi_server.models.screen_scheme_details import ScreenSchemeDetails  # noqa: E501
from openapi_server.models.screen_scheme_id import ScreenSchemeId  # noqa: E501
from openapi_server.models.update_screen_scheme_details import UpdateScreenSchemeDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestScreenSchemesController(BaseTestCase):
    """ScreenSchemesController integration test stubs"""

    def test_create_screen_scheme(self):
        """Test case for create_screen_scheme

        Create screen scheme
        """
        screen_scheme_details = {"screens":"","name":"name","description":"description"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/screenscheme',
            method='POST',
            headers=headers,
            data=json.dumps(screen_scheme_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_screen_scheme(self):
        """Test case for delete_screen_scheme

        Delete screen scheme
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/screenscheme/{screen_scheme_id}'.format(screen_scheme_id='screen_scheme_id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_screen_schemes(self):
        """Test case for get_screen_schemes

        Get screen schemes
        """
        query_string = [('startAt', 0),
                        ('maxResults', 25),
                        ('id', [56]),
                        ('expand', ''),
                        ('queryString', ''),
                        ('orderBy', 'order_by_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/screenscheme',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_screen_scheme(self):
        """Test case for update_screen_scheme

        Update screen scheme
        """
        update_screen_scheme_details = {"screens":"","name":"name","description":"description"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/screenscheme/{screen_scheme_id}'.format(screen_scheme_id='screen_scheme_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(update_screen_scheme_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
