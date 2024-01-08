import unittest

from flask import json

from openapi_server.models.latestposts_topic_slug_get200_response import LatestpostsTopicSlugGet200Response  # noqa: E501
from openapi_server.models.related_tags_tag_get200_response import RelatedTagsTagGet200Response  # noqa: E501
from openapi_server.models.top_writer_topic_slug_get200_response import TopWriterTopicSlugGet200Response  # noqa: E501
from openapi_server.models.topfeeds_tag_mode_get200_response import TopfeedsTagModeGet200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestMiscController(BaseTestCase):
    """MiscController integration test stubs"""

    def test_latestposts_topic_slug_get(self):
        """Test case for latestposts_topic_slug_get

        Get Latest Posts
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/latestposts/{topic_slug}'.format(topic_slug='artificial-intelligence'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_related_tags_tag_get(self):
        """Test case for related_tags_tag_get

        Get Related Tags
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/related_tags/{tag}'.format(tag='blockchain'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_top_writer_topic_slug_get(self):
        """Test case for top_writer_topic_slug_get

        Get Top Writers
        """
        query_string = [('count', 10)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/top_writer/{topic_slug}'.format(topic_slug='relationships'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_topfeeds_tag_mode_get(self):
        """Test case for topfeeds_tag_mode_get

        Get Topfeeds
        """
        query_string = [('after', 0),
                        ('count', 25)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/topfeeds/{tag}/{mode}'.format(tag='artificial-intelligence', mode='new'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
