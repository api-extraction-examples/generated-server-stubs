import unittest

from flask import json

from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.models.popular_error_response import PopularErrorResponse  # noqa: E501
from openapi_server.models.popular_response import PopularResponse  # noqa: E501
from openapi_server.models.programmes_response import ProgrammesResponse  # noqa: E501
from openapi_server.models.radio_error_response import RadioErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestProgrammesController(BaseTestCase):
    """ProgrammesController integration test stubs"""

    def test_get_popular_episodes_clips(self):
        """Test case for get_popular_episodes_clips

        Popular Episodes & Clips
        """
        query_string = [('type', 'type_example'),
                        ('distinct', 'distinct_example'),
                        ('network', 'network_example'),
                        ('network_url_key', 'network_url_key_example'),
                        ('category', 'category_example'),
                        ('format', 'format_example'),
                        ('group', 'group_example'),
                        ('media_type', 'media_type_example'),
                        ('container', 'container_example'),
                        ('media_set', None),
                        ('q', 'q_example')]
        headers = { 
            'Accept': 'application/json',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/radio/popular',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_radio_programmes(self):
        """Test case for get_radio_programmes

        Radio programmes
        """
        query_string = [('kind', 'kind_example'),
                        ('network', 'network_example'),
                        ('network_url_key', 'network_url_key_example'),
                        ('category', 'category_example'),
                        ('sort', 'sort_example'),
                        ('container', 'container_example'),
                        ('type', 'type_example')]
        headers = { 
            'Accept': 'application/json',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/radio/programmes',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_radio_programmes_by_pid(self):
        """Test case for get_radio_programmes_by_pid

        Available radio programme by Pid
        """
        headers = { 
            'Accept': 'application/json',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/radio/programmes/{pid}'.format(pid='pid_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_recommendations(self):
        """Test case for get_recommendations

        Recommended Programmes
        """
        query_string = [('offset', 56),
                        ('limit', 56),
                        ('rights', 'rights_example')]
        headers = { 
            'Accept': 'application/json',
            'authorization': 'Bearer OAUTH_TOKEN',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/my/programmes/recommendations',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
