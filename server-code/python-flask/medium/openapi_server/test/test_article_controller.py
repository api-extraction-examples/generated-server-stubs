import unittest

from flask import json

from openapi_server.models.article_article_id_content_get200_response import ArticleArticleIdContentGet200Response  # noqa: E501
from openapi_server.models.article_article_id_fans_get200_response import ArticleArticleIdFansGet200Response  # noqa: E501
from openapi_server.models.article_article_id_get200_response import ArticleArticleIdGet200Response  # noqa: E501
from openapi_server.models.article_article_id_markdown_get200_response import ArticleArticleIdMarkdownGet200Response  # noqa: E501
from openapi_server.models.article_article_id_related_get200_response import ArticleArticleIdRelatedGet200Response  # noqa: E501
from openapi_server.models.article_article_id_responses_get200_response import ArticleArticleIdResponsesGet200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestArticleController(BaseTestCase):
    """ArticleController integration test stubs"""

    def test_article_article_id_content_get(self):
        """Test case for article_article_id_content_get

        Get Article's Content
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/article/{article_id}/content'.format(article_id='562c5821b5f0'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_article_article_id_fans_get(self):
        """Test case for article_article_id_fans_get

        Get Article Fans
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/article/{article_id}/fans'.format(article_id='67fa62fc1971'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_article_article_id_get(self):
        """Test case for article_article_id_get

        Get Article Info
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/article/{article_id}'.format(article_id='f06086080568'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_article_article_id_markdown_get(self):
        """Test case for article_article_id_markdown_get

        Get Article's Markdown
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/article/{article_id}/markdown'.format(article_id='67fa62fc1971'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_article_article_id_related_get(self):
        """Test case for article_article_id_related_get

        Get Related Articles
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/article/{article_id}/related'.format(article_id='67fa62fc1971'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_article_article_id_responses_get(self):
        """Test case for article_article_id_responses_get

        Get Article Responses
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/article/{article_id}/responses'.format(article_id='67fa62fc1971'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
