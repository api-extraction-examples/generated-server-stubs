import unittest

from flask import json

from openapi_server.models.search_articles_query_query_get200_response import SearchArticlesQueryQueryGet200Response  # noqa: E501
from openapi_server.models.search_lists_query_query_get200_response import SearchListsQueryQueryGet200Response  # noqa: E501
from openapi_server.models.search_publications_query_query_get200_response import SearchPublicationsQueryQueryGet200Response  # noqa: E501
from openapi_server.models.search_tags_query_query_get200_response import SearchTagsQueryQueryGet200Response  # noqa: E501
from openapi_server.models.search_users_query_query_get200_response import SearchUsersQueryQueryGet200Response  # noqa: E501
from openapi_server.test import BaseTestCase


class TestSearchController(BaseTestCase):
    """SearchController integration test stubs"""

    def test_search_articlesqueryquery_get(self):
        """Test case for search_articlesqueryquery_get

        Search Articles
        """
        query_string = [('query', 'startup')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/search/articles?query={query}',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_listsqueryquery_get(self):
        """Test case for search_listsqueryquery_get

        Search Lists
        """
        query_string = [('query', 'artificial intelligence')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/search/lists?query={query}',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_publicationsqueryquery_get(self):
        """Test case for search_publicationsqueryquery_get

        Search Publications
        """
        query_string = [('query', 'mental health')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/search/publications?query={query}',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_tagsqueryquery_get(self):
        """Test case for search_tagsqueryquery_get

        Search Tags
        """
        query_string = [('query', 'blockchain')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/search/tags?query={query}',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_search_usersqueryquery_get(self):
        """Test case for search_usersqueryquery_get

        Search Users
        """
        query_string = [('query', 'data engineer')]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/search/users?query={query}',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
