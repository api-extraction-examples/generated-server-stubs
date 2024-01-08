import unittest

from flask import json

from openapi_server.models.publication_id_for_publication_slug_get200_response import PublicationIdForPublicationSlugGet200Response  # noqa: E501
from openapi_server.models.publication_publication_id_articles_get200_response import PublicationPublicationIdArticlesGet200Response  # noqa: E501
from openapi_server.models.publication_publication_id_get200_response import PublicationPublicationIdGet200Response  # noqa: E501
from openapi_server.models.publication_publication_id_newsletter_get200_response import PublicationPublicationIdNewsletterGet200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPublicationController(BaseTestCase):
    """PublicationController integration test stubs"""

    def test_publication_id_for_publication_slug_get(self):
        """Test case for publication_id_for_publication_slug_get

        Get Publication ID
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/publication/id_for/{publication_slug}'.format(publication_slug='codex'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_publication_publication_id_articles_get(self):
        """Test case for publication_publication_id_articles_get

        Get Publication Articles
        """
        query_string = [('from', '2023-01-31T13:10:00')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/publication/{publication_id}/articles'.format(publication_id='98111c9905da'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_publication_publication_id_get(self):
        """Test case for publication_publication_id_get

        Get Publication Info
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/publication/{publication_id}'.format(publication_id='98111c9905da'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_publication_publication_id_newsletter_get(self):
        """Test case for publication_publication_id_newsletter_get

        Get Publication Newsletter
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/publication/{publication_id}/newsletter'.format(publication_id='98111c9905da'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
