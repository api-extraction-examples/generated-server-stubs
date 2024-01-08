import unittest

from flask import json

from openapi_server.models.app_response import AppResponse  # noqa: E501
from openapi_server.models.beta_group_beta_testers_linkages_request import BetaGroupBetaTestersLinkagesRequest  # noqa: E501
from openapi_server.models.beta_group_beta_testers_linkages_response import BetaGroupBetaTestersLinkagesResponse  # noqa: E501
from openapi_server.models.beta_group_builds_linkages_request import BetaGroupBuildsLinkagesRequest  # noqa: E501
from openapi_server.models.beta_group_builds_linkages_response import BetaGroupBuildsLinkagesResponse  # noqa: E501
from openapi_server.models.beta_group_create_request import BetaGroupCreateRequest  # noqa: E501
from openapi_server.models.beta_group_response import BetaGroupResponse  # noqa: E501
from openapi_server.models.beta_group_update_request import BetaGroupUpdateRequest  # noqa: E501
from openapi_server.models.beta_groups_response import BetaGroupsResponse  # noqa: E501
from openapi_server.models.beta_testers_response import BetaTestersResponse  # noqa: E501
from openapi_server.models.builds_response import BuildsResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server.test import BaseTestCase


class TestBetaGroupsController(BaseTestCase):
    """BetaGroupsController integration test stubs"""

    def test_beta_groups_app_get_to_one_related(self):
        """Test case for beta_groups_app_get_to_one_related

        
        """
        query_string = [('fields[apps]', ['fields_apps_example'])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaGroups/{id}/app'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_groups_beta_testers_create_to_many_relationship(self):
        """Test case for beta_groups_beta_testers_create_to_many_relationship

        
        """
        beta_group_beta_testers_linkages_request = {"data":[{"id":"id","type":"betaTesters"},{"id":"id","type":"betaTesters"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaGroups/{id}/relationships/betaTesters'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(beta_group_beta_testers_linkages_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_groups_beta_testers_delete_to_many_relationship(self):
        """Test case for beta_groups_beta_testers_delete_to_many_relationship

        
        """
        beta_group_beta_testers_linkages_request = {"data":[{"id":"id","type":"betaTesters"},{"id":"id","type":"betaTesters"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaGroups/{id}/relationships/betaTesters'.format(id='id_example'),
            method='DELETE',
            headers=headers,
            data=json.dumps(beta_group_beta_testers_linkages_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_groups_beta_testers_get_to_many_related(self):
        """Test case for beta_groups_beta_testers_get_to_many_related

        
        """
        query_string = [('fields[betaTesters]', ['fields_beta_testers_example']),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaGroups/{id}/betaTesters'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_groups_beta_testers_get_to_many_relationship(self):
        """Test case for beta_groups_beta_testers_get_to_many_relationship

        
        """
        query_string = [('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaGroups/{id}/relationships/betaTesters'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_groups_builds_create_to_many_relationship(self):
        """Test case for beta_groups_builds_create_to_many_relationship

        
        """
        beta_group_builds_linkages_request = {"data":[{"id":"id","type":"builds"},{"id":"id","type":"builds"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaGroups/{id}/relationships/builds'.format(id='id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(beta_group_builds_linkages_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_groups_builds_delete_to_many_relationship(self):
        """Test case for beta_groups_builds_delete_to_many_relationship

        
        """
        beta_group_builds_linkages_request = {"data":[{"id":"id","type":"builds"},{"id":"id","type":"builds"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaGroups/{id}/relationships/builds'.format(id='id_example'),
            method='DELETE',
            headers=headers,
            data=json.dumps(beta_group_builds_linkages_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_groups_builds_get_to_many_related(self):
        """Test case for beta_groups_builds_get_to_many_related

        
        """
        query_string = [('fields[builds]', ['fields_builds_example']),
                        ('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaGroups/{id}/builds'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_groups_builds_get_to_many_relationship(self):
        """Test case for beta_groups_builds_get_to_many_relationship

        
        """
        query_string = [('limit', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaGroups/{id}/relationships/builds'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_groups_create_instance(self):
        """Test case for beta_groups_create_instance

        
        """
        beta_group_create_request = {"data":{"relationships":{"app":{"data":{"id":"id","type":"apps"}},"builds":{"data":[{"id":"id","type":"builds"},{"id":"id","type":"builds"}]},"betaTesters":{"data":[{"id":"id","type":"betaTesters"},{"id":"id","type":"betaTesters"}]}},"attributes":{"publicLinkLimit":0,"publicLinkEnabled":True,"name":"name","feedbackEnabled":True,"publicLinkLimitEnabled":True},"type":"betaGroups"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaGroups',
            method='POST',
            headers=headers,
            data=json.dumps(beta_group_create_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_groups_delete_instance(self):
        """Test case for beta_groups_delete_instance

        
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaGroups/{id}'.format(id='id_example'),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_groups_get_collection(self):
        """Test case for beta_groups_get_collection

        
        """
        query_string = [('filter[isInternalGroup]', ['filter_is_internal_group_example']),
                        ('filter[name]', ['filter_name_example']),
                        ('filter[publicLink]', ['filter_public_link_example']),
                        ('filter[publicLinkEnabled]', ['filter_public_link_enabled_example']),
                        ('filter[publicLinkLimitEnabled]', ['filter_public_link_limit_enabled_example']),
                        ('filter[app]', ['filter_app_example']),
                        ('filter[builds]', ['filter_builds_example']),
                        ('filter[id]', ['filter_id_example']),
                        ('sort', ['sort_example']),
                        ('fields[betaGroups]', ['fields_beta_groups_example']),
                        ('limit', 56),
                        ('include', ['include_example']),
                        ('fields[builds]', ['fields_builds_example']),
                        ('fields[betaTesters]', ['fields_beta_testers_example']),
                        ('fields[apps]', ['fields_apps_example']),
                        ('limit[betaTesters]', 56),
                        ('limit[builds]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaGroups',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_groups_get_instance(self):
        """Test case for beta_groups_get_instance

        
        """
        query_string = [('fields[betaGroups]', ['fields_beta_groups_example']),
                        ('include', ['include_example']),
                        ('fields[builds]', ['fields_builds_example']),
                        ('fields[betaTesters]', ['fields_beta_testers_example']),
                        ('fields[apps]', ['fields_apps_example']),
                        ('limit[betaTesters]', 56),
                        ('limit[builds]', 56)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaGroups/{id}'.format(id='id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_beta_groups_update_instance(self):
        """Test case for beta_groups_update_instance

        
        """
        beta_group_update_request = {"data":{"attributes":{"publicLinkLimit":0,"publicLinkEnabled":True,"name":"name","feedbackEnabled":True,"publicLinkLimitEnabled":True},"id":"id","type":"betaGroups"}}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
        }
        response = self.client.open(
            '/v1/betaGroups/{id}'.format(id='id_example'),
            method='PATCH',
            headers=headers,
            data=json.dumps(beta_group_update_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
