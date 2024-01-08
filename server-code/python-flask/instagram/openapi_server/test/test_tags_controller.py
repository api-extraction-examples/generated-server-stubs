import unittest

from flask import json

from openapi_server.models.tag_info_response import TagInfoResponse  # noqa: E501
from openapi_server.models.tag_media_list_response import TagMediaListResponse  # noqa: E501
from openapi_server.models.tag_search_response import TagSearchResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestTagsController(BaseTestCase):
    """TagsController integration test stubs"""

    def test_tags_search_get(self):
        """Test case for tags_search_get

        Search for tags by name.
        """
        query_string = [('q', 'q_example')]
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/tags/search',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_tags_tag_name_get(self):
        """Test case for tags_tag_name_get

        Get information about a tag object.
        """
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/tags/{tag_name}'.format(tag_name='tag_name_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_tags_tag_name_media_recent_get(self):
        """Test case for tags_tag_name_media_recent_get

        Get a list of recently tagged media.
        """
        query_string = [('count', 56),
                        ('min_tag_id', 'min_tag_id_example'),
                        ('max_tag_id', 'max_tag_id_example')]
        headers = { 
            'Accept': 'application/json',
            'api_key': 'special-key',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/tags/{tag_name}/media/recent'.format(tag_name='tag_name_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
