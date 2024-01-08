import unittest

from flask import json

from openapi_server.models.auto_complete_suggestions import AutoCompleteSuggestions  # noqa: E501
from openapi_server.models.converted_jql_queries import ConvertedJQLQueries  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.jql_personal_data_migration_request import JQLPersonalDataMigrationRequest  # noqa: E501
from openapi_server.models.jql_reference_data import JQLReferenceData  # noqa: E501
from openapi_server.models.jql_queries_to_parse import JqlQueriesToParse  # noqa: E501
from openapi_server.models.jql_queries_to_sanitize import JqlQueriesToSanitize  # noqa: E501
from openapi_server.models.parsed_jql_queries import ParsedJqlQueries  # noqa: E501
from openapi_server.models.sanitized_jql_queries import SanitizedJqlQueries  # noqa: E501
from openapi_server.models.search_auto_complete_filter import SearchAutoCompleteFilter  # noqa: E501
from openapi_server.test import BaseTestCase


class TestJQLController(BaseTestCase):
    """JQLController integration test stubs"""

    def test_get_auto_complete(self):
        """Test case for get_auto_complete

        Get field reference data (GET)
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/jql/autocompletedata',
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_auto_complete_post(self):
        """Test case for get_auto_complete_post

        Get field reference data (POST)
        """
        search_auto_complete_filter = {"projectIds":[0,0],"includeCollapsedFields":False}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/jql/autocompletedata',
            method='POST',
            headers=headers,
            data=json.dumps(search_auto_complete_filter),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_field_auto_complete_for_query_string(self):
        """Test case for get_field_auto_complete_for_query_string

        Get field auto complete suggestions
        """
        query_string = [('fieldName', 'reporter'),
                        ('fieldValue', 'field_value_example'),
                        ('predicateName', 'predicate_name_example'),
                        ('predicateValue', 'predicate_value_example')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/jql/autocompletedata/suggestions',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_migrate_queries(self):
        """Test case for migrate_queries

        Convert user identifiers to account IDs in JQL queries
        """
        jql_personal_data_migration_request = {"queryStrings":["queryStrings","queryStrings"]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/jql/pdcleaner',
            method='POST',
            headers=headers,
            data=json.dumps(jql_personal_data_migration_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_parse_jql_queries(self):
        """Test case for parse_jql_queries

        Parse JQL query
        """
        jql_queries_to_parse = {"queries":["queries","queries"]}
        query_string = [('validation', 'strict')]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/jql/parse',
            method='POST',
            headers=headers,
            data=json.dumps(jql_queries_to_parse),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_sanitise_jql_queries(self):
        """Test case for sanitise_jql_queries

        Sanitize JQL queries
        """
        jql_queries_to_sanitize = {"queries":[{"accountId":"accountId","query":"query"},{"accountId":"accountId","query":"query"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/jql/sanitize',
            method='POST',
            headers=headers,
            data=json.dumps(jql_queries_to_sanitize),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
