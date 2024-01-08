import unittest

from flask import json

from openapi_server.models.podcast_episodes_response import PodcastEpisodesResponse  # noqa: E501
from openapi_server.models.podcast_error_response import PodcastErrorResponse  # noqa: E501
from openapi_server.models.podcasts_featured_response import PodcastsFeaturedResponse  # noqa: E501
from openapi_server.models.podcasts_response import PodcastsResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPodcastsController(BaseTestCase):
    """PodcastsController integration test stubs"""

    def test_get_podcast_by_pid(self):
        """Test case for get_podcast_by_pid

        Podcast
        """
        query_string = [('offset', 56),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/podcasts/{pid}'.format(pid='pid_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_podcast_episodes(self):
        """Test case for get_podcast_episodes

        Podcast Episodes
        """
        query_string = [('offset', 56),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/podcasts/{pid}/episodes'.format(pid='pid_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_podcasts(self):
        """Test case for get_podcasts

        All Podcasts
        """
        query_string = [('offset', 56),
                        ('limit', 56),
                        ('sort', 'sort_example'),
                        ('network', 'network_example'),
                        ('network_url_key', 'network_url_key_example'),
                        ('category', 'category_example'),
                        ('q', 'q_example'),
                        ('coverage', 'coverage_example')]
        headers = { 
            'Accept': 'application/json',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/podcasts',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_podcasts_featured(self):
        """Test case for get_podcasts_featured

        Featured Podcasts
        """
        headers = { 
            'Accept': 'application/json',
            'x_api_key': 'x_api_key_example',
        }
        response = self.client.open(
            '/podcasts/featured',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
