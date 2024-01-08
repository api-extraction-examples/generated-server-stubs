import unittest

from flask import json

from openapi_server.models.associate_field_configurations_with_issue_types_request import AssociateFieldConfigurationsWithIssueTypesRequest  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.field_configuration import FieldConfiguration  # noqa: E501
from openapi_server.models.field_configuration_details import FieldConfigurationDetails  # noqa: E501
from openapi_server.models.field_configuration_items_details import FieldConfigurationItemsDetails  # noqa: E501
from openapi_server.models.field_configuration_scheme import FieldConfigurationScheme  # noqa: E501
from openapi_server.models.field_configuration_scheme_project_association import FieldConfigurationSchemeProjectAssociation  # noqa: E501
from openapi_server.models.issue_type_ids_to_remove import IssueTypeIdsToRemove  # noqa: E501
from openapi_server.models.page_bean_field_configuration_details import PageBeanFieldConfigurationDetails  # noqa: E501
from openapi_server.models.page_bean_field_configuration_issue_type_item import PageBeanFieldConfigurationIssueTypeItem  # noqa: E501
from openapi_server.models.page_bean_field_configuration_item import PageBeanFieldConfigurationItem  # noqa: E501
from openapi_server.models.page_bean_field_configuration_scheme import PageBeanFieldConfigurationScheme  # noqa: E501
from openapi_server.models.page_bean_field_configuration_scheme_projects import PageBeanFieldConfigurationSchemeProjects  # noqa: E501
from openapi_server.models.update_field_configuration_scheme_details import UpdateFieldConfigurationSchemeDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueFieldConfigurationsController(BaseTestCase):
    """IssueFieldConfigurationsController integration test stubs"""

    def test_assign_field_configuration_scheme_to_project(self):
        """Test case for assign_field_configuration_scheme_to_project

        Assign field configuration scheme to project
        """
        field_configuration_scheme_project_association = {"fieldConfigurationSchemeId":"fieldConfigurationSchemeId","projectId":"projectId"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/fieldconfigurationscheme/project',
            method='PUT',
            headers=headers,
            data=json.dumps(field_configuration_scheme_project_association),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_field_configuration(self):
        """Test case for create_field_configuration

        Create field configuration
        """
        field_configuration_details = {"name":"name","description":"description"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/fieldconfiguration',
            method='POST',
            headers=headers,
            data=json.dumps(field_configuration_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_field_configuration_scheme(self):
        """Test case for create_field_configuration_scheme

        Create field configuration scheme
        """
        update_field_configuration_scheme_details = {"name":"name","description":"description"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/fieldconfigurationscheme',
            method='POST',
            headers=headers,
            data=json.dumps(update_field_configuration_scheme_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_field_configuration(self):
        """Test case for delete_field_configuration

        Delete field configuration
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/fieldconfiguration/{id}'.format(id=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_field_configuration_scheme(self):
        """Test case for delete_field_configuration_scheme

        Delete field configuration scheme
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/fieldconfigurationscheme/{id}'.format(id=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_field_configuration_schemes(self):
        """Test case for get_all_field_configuration_schemes

        Get all field configuration schemes
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50),
                        ('id', [56])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/fieldconfigurationscheme',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_all_field_configurations(self):
        """Test case for get_all_field_configurations

        Get all field configurations
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50),
                        ('id', [56]),
                        ('isDefault', False),
                        ('query', '')]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/fieldconfiguration',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_field_configuration_items(self):
        """Test case for get_field_configuration_items

        Get field configuration items
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/fieldconfiguration/{id}/fields'.format(id=56),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_field_configuration_scheme_mappings(self):
        """Test case for get_field_configuration_scheme_mappings

        Get field configuration issue type items
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50),
                        ('fieldConfigurationSchemeId', [56])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/fieldconfigurationscheme/mapping',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_field_configuration_scheme_project_mapping(self):
        """Test case for get_field_configuration_scheme_project_mapping

        Get field configuration schemes for projects
        """
        query_string = [('startAt', 0),
                        ('maxResults', 50),
                        ('projectId', [56])]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/fieldconfigurationscheme/project',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_issue_types_from_global_field_configuration_scheme(self):
        """Test case for remove_issue_types_from_global_field_configuration_scheme

        Remove issue types from field configuration scheme
        """
        issue_type_ids_to_remove = {"issueTypeIds":["issueTypeIds","issueTypeIds"]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/fieldconfigurationscheme/{id}/mapping/delete'.format(id=56),
            method='POST',
            headers=headers,
            data=json.dumps(issue_type_ids_to_remove),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_field_configuration_scheme_mapping(self):
        """Test case for set_field_configuration_scheme_mapping

        Assign issue types to field configurations
        """
        associate_field_configurations_with_issue_types_request = {"mappings":[{"issueTypeId":"issueTypeId","fieldConfigurationId":"fieldConfigurationId"},{"issueTypeId":"issueTypeId","fieldConfigurationId":"fieldConfigurationId"}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/fieldconfigurationscheme/{id}/mapping'.format(id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(associate_field_configurations_with_issue_types_request),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_field_configuration(self):
        """Test case for update_field_configuration

        Update field configuration
        """
        field_configuration_details = {"name":"name","description":"description"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/fieldconfiguration/{id}'.format(id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(field_configuration_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_field_configuration_items(self):
        """Test case for update_field_configuration_items

        Update field configuration items
        """
        field_configuration_items_details = {"fieldConfigurationItems":[{"isRequired":True,"renderer":"renderer","description":"description","id":"id","isHidden":True},{"isRequired":True,"renderer":"renderer","description":"description","id":"id","isHidden":True}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/fieldconfiguration/{id}/fields'.format(id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(field_configuration_items_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_field_configuration_scheme(self):
        """Test case for update_field_configuration_scheme

        Update field configuration scheme
        """
        update_field_configuration_scheme_details = {"name":"name","description":"description"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/fieldconfigurationscheme/{id}'.format(id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(update_field_configuration_scheme_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
