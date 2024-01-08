import unittest

from flask import json

from openapi_server.models.personalised_radio_batch_request import PersonalisedRadioBatchRequest  # noqa: E501
from openapi_server.models.personalised_radio_error_response import PersonalisedRadioErrorResponse  # noqa: E501
from openapi_server.models.personalised_radio_request import PersonalisedRadioRequest  # noqa: E501
from openapi_server.models.personalised_radio_response import PersonalisedRadioResponse  # noqa: E501
from openapi_server.models.personalised_radio_success_response import PersonalisedRadioSuccessResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestRadioController(BaseTestCase):
    """RadioController integration test stubs"""

    def test_delete_personalised_radio_by_activity_type_by_id(self):
        """Test case for delete_personalised_radio_by_activity_type_by_id

        Favourite Episode or Clip
        """
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/radio/favourites/{type}/{pid}'.format(type='type_example', pid='pid_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_personalised_radio_follows_by_type_by_id(self):
        """Test case for delete_personalised_radio_follows_by_type_by_id

        Followed Brand or Series
        """
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/radio/follows/{type}/{pid}'.format(type='type_example', pid='pid_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_personalised_radio_by_activity_type_by_id(self):
        """Test case for get_personalised_radio_by_activity_type_by_id

        Favourite Episode or Clip
        """
        query_string = [('show_all_activity', True)]
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/radio/favourites/{type}/{pid}'.format(type='type_example', pid='pid_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_personalised_radio_favourites(self):
        """Test case for get_personalised_radio_favourites

        Favourite Episodes and Clips
        """
        query_string = [('offset', 56),
                        ('limit', 56),
                        ('sort', 'sort_example'),
                        ('show_all_activity', True)]
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/radio/favourites',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_personalised_radio_favourites_by_type(self):
        """Test case for get_personalised_radio_favourites_by_type

        Favourite Episodes and Clips by Type
        """
        query_string = [('sort', 'sort_example'),
                        ('show_all_activity', True),
                        ('offset', 56),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/radio/favourites/{type}'.format(type='type_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_personalised_radio_follows(self):
        """Test case for get_personalised_radio_follows

        Followed Brands and Series
        """
        query_string = [('offset', 56),
                        ('limit', 56),
                        ('sort', 'sort_example'),
                        ('show_all_activity', True)]
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/radio/follows',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_personalised_radio_follows_by_type(self):
        """Test case for get_personalised_radio_follows_by_type

        Followed Brands or Series by Type
        """
        query_string = [('sort', 'sort_example'),
                        ('offset', 56),
                        ('limit', 56),
                        ('show_all_activity', True)]
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/radio/follows/{type}'.format(type='type_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_personalised_radio_follows_by_type_by_id(self):
        """Test case for get_personalised_radio_follows_by_type_by_id

        Followed Brand or Series
        """
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/radio/follows/{type}/{pid}'.format(type='type_example', pid='pid_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_personalised_radio_plays(self):
        """Test case for get_personalised_radio_plays

        Played Episode or Clip
        """
        query_string = [('offset', 56),
                        ('limit', 56),
                        ('sort', 'sort_example'),
                        ('show_all_activity', True)]
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/radio/plays',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_personalised_radio_batch(self):
        """Test case for post_personalised_radio_batch

        Favourite Episodes and Clips
        """
        body = {"added_at":"added_at","metadata":{"key":"key"},"context":"context","action":"action","id":"id","type":"type"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/radio/favourites',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_personalised_radio_by_activity_type_by_id(self):
        """Test case for post_personalised_radio_by_activity_type_by_id

        Favourite Episode or Clip
        """
        body = {"added_at":"added_at","metadata":{"key":"key"},"context":"context","action":"action"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/radio/favourites/{type}/{pid}'.format(type='type_example', pid='pid_example'),
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_personalised_radio_follows_batch(self):
        """Test case for post_personalised_radio_follows_batch

        Followed Brands and Series
        """
        body = {"added_at":"added_at","metadata":{"key":"key"},"context":"context","action":"action","id":"id","type":"type"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/radio/follows',
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_post_personalised_radio_follows_by_type_by_id(self):
        """Test case for post_personalised_radio_follows_by_type_by_id

        Followed Brand or Series
        """
        body = {"added_at":"added_at","metadata":{"key":"key"},"context":"context","action":"action"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/radio/follows/{type}/{pid}'.format(type='type_example', pid='pid_example'),
            method='POST',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_put_personalised_radio_batch(self):
        """Test case for put_personalised_radio_batch

        Favourite Episodes and Clips
        """
        body = {"added_at":"added_at","metadata":{"key":"key"},"context":"context","action":"action","id":"id","type":"type"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/radio/favourites',
            method='PUT',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_put_personalised_radio_by_activity_type_by_id(self):
        """Test case for put_personalised_radio_by_activity_type_by_id

        Favourite Episode or Clip
        """
        body = {"added_at":"added_at","metadata":{"key":"key"},"context":"context","action":"action"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/radio/favourites/{type}/{pid}'.format(type='type_example', pid='pid_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_put_personalised_radio_follows_batch(self):
        """Test case for put_personalised_radio_follows_batch

        Followed Brands and Series
        """
        body = {"added_at":"added_at","metadata":{"key":"key"},"context":"context","action":"action","id":"id","type":"type"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/radio/follows',
            method='PUT',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_put_personalised_radio_follows_by_type_by_id(self):
        """Test case for put_personalised_radio_follows_by_type_by_id

        Followed Brand or Series
        """
        body = {"added_at":"added_at","metadata":{"key":"key"},"context":"context","action":"action"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_authentication_provider': 'idv5',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/radio/follows/{type}/{pid}'.format(type='type_example', pid='pid_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
