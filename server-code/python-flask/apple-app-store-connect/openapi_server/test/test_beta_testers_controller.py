import unittest

from flask import json

from openapi_server.models.apps_response import AppsResponse  # noqa: E501
from openapi_server.models.beta_groups_response import BetaGroupsResponse  # noqa: E501
from openapi_server.models.beta_tester_apps_linkages_request import BetaTesterAppsLinkagesRequest  # noqa: E501
from openapi_server.models.beta_tester_apps_linkages_response import BetaTesterAppsLinkagesResponse  # noqa: E501
from openapi_server.models.beta_tester_beta_groups_linkages_request import BetaTesterBetaGroupsLinkagesRequest  # noqa: E501
from openapi_server.models.beta_tester_beta_groups_linkages_response import BetaTesterBetaGroupsLinkagesResponse  # noqa: E501
from openapi_server.models.beta_tester_builds_linkages_request import BetaTesterBuildsLinkagesRequest  # noqa: E501
from openapi_server.models.beta_tester_builds_linkages_response import BetaTesterBuildsLinkagesResponse  # noqa: E501
from openapi_server.models.beta_tester_create_request import BetaTesterCreateRequest  # noqa: E501
from openapi_server.models.beta_tester_response import BetaTesterResponse  # noqa: E501
from openapi_server.models.beta_testers_response import BetaTestersResponse  # noqa: E501
from openapi_server.models.builds_response import BuildsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBetaTestersController(BaseTestCase):
    """BetaTestersController integration test stubs"""

    def test_beta_testers_apps_delete_to_many_relationship(self):
        """Test case for beta_testers_apps_delete_to_many_relationship

        
        """
        beta_tester_apps_linkages_request = {"data":[{"id":"id","type":"apps"},{"id":"id","type":"apps"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaTesters/{id}/relationships/apps'.format(id='id_example'),
            method='DELETE',
            headers=headers,
            data=json.dumps(beta_tester_apps_linkages_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_testers_apps_get_to_many_related(self):
        """Test case for beta_testers_apps_get_to_many_related

        
        """
        query_string = [('fields[apps]', ['fields_apps_example']),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaTesters/{id}/apps'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_testers_apps_get_to_many_relationship(self):
        """Test case for beta_testers_apps_get_to_many_relationship

        
        """
        query_string = [('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaTesters/{id}/relationships/apps'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_testers_beta_groups_create_to_many_relationship(self):
        """Test case for beta_testers_beta_groups_create_to_many_relationship

        
        """
        beta_tester_beta_groups_linkages_request = {"data":[{"id":"id","type":"betaGroups"},{"id":"id","type":"betaGroups"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaTesters/{id}/relationships/betaGroups'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(beta_tester_beta_groups_linkages_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_testers_beta_groups_delete_to_many_relationship(self):
        """Test case for beta_testers_beta_groups_delete_to_many_relationship

        
        """
        beta_tester_beta_groups_linkages_request = {"data":[{"id":"id","type":"betaGroups"},{"id":"id","type":"betaGroups"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaTesters/{id}/relationships/betaGroups'.format(id='id_example'),
            method='DELETE',
            headers=headers,
            data=json.dumps(beta_tester_beta_groups_linkages_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_testers_beta_groups_get_to_many_related(self):
        """Test case for beta_testers_beta_groups_get_to_many_related

        
        """
        query_string = [('fields[betaGroups]', ['fields_beta_groups_example']),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaTesters/{id}/betaGroups'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_testers_beta_groups_get_to_many_relationship(self):
        """Test case for beta_testers_beta_groups_get_to_many_relationship

        
        """
        query_string = [('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaTesters/{id}/relationships/betaGroups'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_testers_builds_create_to_many_relationship(self):
        """Test case for beta_testers_builds_create_to_many_relationship

        
        """
        beta_tester_builds_linkages_request = {"data":[{"id":"id","type":"builds"},{"id":"id","type":"builds"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaTesters/{id}/relationships/builds'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(beta_tester_builds_linkages_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_testers_builds_delete_to_many_relationship(self):
        """Test case for beta_testers_builds_delete_to_many_relationship

        
        """
        beta_tester_builds_linkages_request = {"data":[{"id":"id","type":"builds"},{"id":"id","type":"builds"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaTesters/{id}/relationships/builds'.format(id='id_example'),
            method='DELETE',
            headers=headers,
            data=json.dumps(beta_tester_builds_linkages_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_testers_builds_get_to_many_related(self):
        """Test case for beta_testers_builds_get_to_many_related

        
        """
        query_string = [('fields[builds]', ['fields_builds_example']),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaTesters/{id}/builds'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_testers_builds_get_to_many_relationship(self):
        """Test case for beta_testers_builds_get_to_many_relationship

        
        """
        query_string = [('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaTesters/{id}/relationships/builds'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_testers_create_instance(self):
        """Test case for beta_testers_create_instance

        
        """
        beta_tester_create_request = {"data":{"relationships":{"betaGroups":{"data":[{"id":"id","type":"betaGroups"},{"id":"id","type":"betaGroups"}]},"builds":{"data":[{"id":"id","type":"builds"},{"id":"id","type":"builds"}]}},"attributes":{"firstName":"firstName","lastName":"lastName","email":"email"},"type":"betaTesters"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaTesters',
            method='POST',
            headers=headers,
            data=json.dumps(beta_tester_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_testers_delete_instance(self):
        """Test case for beta_testers_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaTesters/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_testers_get_collection(self):
        """Test case for beta_testers_get_collection

        
        """
        query_string = [('filter[email]', ['filter_email_example']),
                        ('filter[firstName]', ['filter_first_name_example']),
                        ('filter[inviteType]', ['filter_invite_type_example']),
                        ('filter[lastName]', ['filter_last_name_example']),
                        ('filter[apps]', ['filter_apps_example']),
                        ('filter[betaGroups]', ['filter_beta_groups_example']),
                        ('filter[builds]', ['filter_builds_example']),
                        ('sort', ['sort_example']),
                        ('fields[betaTesters]', ['fields_beta_testers_example']),
                        ('limit', 56),
                        ('include', ['include_example']),
                        ('fields[betaGroups]', ['fields_beta_groups_example']),
                        ('fields[builds]', ['fields_builds_example']),
                        ('fields[apps]', ['fields_apps_example']),
                        ('limit[apps]', 56),
                        ('limit[betaGroups]', 56),
                        ('limit[builds]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaTesters',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_testers_get_instance(self):
        """Test case for beta_testers_get_instance

        
        """
        query_string = [('fields[betaTesters]', ['fields_beta_testers_example']),
                        ('include', ['include_example']),
                        ('fields[betaGroups]', ['fields_beta_groups_example']),
                        ('fields[builds]', ['fields_builds_example']),
                        ('fields[apps]', ['fields_apps_example']),
                        ('limit[apps]', 56),
                        ('limit[betaGroups]', 56),
                        ('limit[builds]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaTesters/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
