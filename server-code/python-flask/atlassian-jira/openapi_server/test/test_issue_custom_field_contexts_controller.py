import unittest

from flask import json

from openapi_server.models.create_custom_field_context import CreateCustomFieldContext  # noqa: E501
from openapi_server.models.custom_field_context_default_value_update import CustomFieldContextDefaultValueUpdate  # noqa: E501
from openapi_server.models.custom_field_context_update_details import CustomFieldContextUpdateDetails  # noqa: E501
from openapi_server.models.issue_type_ids import IssueTypeIds  # noqa: E501
from openapi_server.models.page_bean_context_for_project_and_issue_type import PageBeanContextForProjectAndIssueType  # noqa: E501
from openapi_server.models.page_bean_custom_field_context import PageBeanCustomFieldContext  # noqa: E501
from openapi_server.models.page_bean_custom_field_context_default_value import PageBeanCustomFieldContextDefaultValue  # noqa: E501
from openapi_server.models.page_bean_custom_field_context_project_mapping import PageBeanCustomFieldContextProjectMapping  # noqa: E501
from openapi_server.models.page_bean_issue_type_to_context_mapping import PageBeanIssueTypeToContextMapping  # noqa: E501
from openapi_server.models.project_ids import ProjectIds  # noqa: E501
from openapi_server.models.project_issue_type_mappings import ProjectIssueTypeMappings  # noqa: E501
from openapi_server.test import BaseTestCase


class TestIssueCustomFieldContextsController(BaseTestCase):
    """IssueCustomFieldContextsController integration test stubs"""

    def test_add_issue_types_to_context(self):
        """Test case for add_issue_types_to_context

        Add issue types to context
        """
        issue_type_ids = {"issueTypeIds":["issueTypeIds","issueTypeIds"]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_id}/context/{context_id}/issuetype'.format(field_id='field_id_example', context_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(issue_type_ids),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_assign_projects_to_custom_field_context(self):
        """Test case for assign_projects_to_custom_field_context

        Assign custom field context to projects
        """
        project_ids = {"projectIds":["projectIds","projectIds"]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_id}/context/{context_id}/project'.format(field_id='field_id_example', context_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(project_ids),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_create_custom_field_context(self):
        """Test case for create_custom_field_context

        Create custom field context
        """
        create_custom_field_context = {"issueTypeIds":["issueTypeIds","issueTypeIds"],"name":"name","description":"description","id":"id","projectIds":["projectIds","projectIds"]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_id}/context'.format(field_id='field_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(create_custom_field_context),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_custom_field_context(self):
        """Test case for delete_custom_field_context

        Delete custom field context
        """
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_id}/context/{context_id}'.format(field_id='field_id_example', context_id=56),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_contexts_for_field(self):
        """Test case for get_contexts_for_field

        Get custom field contexts
        """
        query_string = [('isAnyIssueType', True),
                        ('isGlobalContext', True),
                        ('contextId', [56]),
                        ('startAt', 0),
                        ('maxResults', 50)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_id}/context'.format(field_id='field_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_custom_field_contexts_for_projects_and_issue_types(self):
        """Test case for get_custom_field_contexts_for_projects_and_issue_types

        Get custom field contexts for projects and issue types
        """
        project_issue_type_mappings = {"mappings":[{"issueTypeId":"issueTypeId","projectId":"projectId"},{"issueTypeId":"issueTypeId","projectId":"projectId"}]}
        query_string = [('startAt', 0),
                        ('maxResults', 50)]
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_id}/context/mapping'.format(field_id='field_id_example'),
            method='POST',
            headers=headers,
            data=json.dumps(project_issue_type_mappings),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_default_values(self):
        """Test case for get_default_values

        Get custom field contexts default values
        """
        query_string = [('contextId', [56]),
                        ('startAt', 0),
                        ('maxResults', 50)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_id}/context/defaultValue'.format(field_id='field_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_issue_type_mappings_for_contexts(self):
        """Test case for get_issue_type_mappings_for_contexts

        Get issue types for custom field context
        """
        query_string = [('contextId', [56]),
                        ('startAt', 0),
                        ('maxResults', 50)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_id}/context/issuetypemapping'.format(field_id='field_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_project_context_mapping(self):
        """Test case for get_project_context_mapping

        Get project mappings for custom field context
        """
        query_string = [('contextId', [56]),
                        ('startAt', 0),
                        ('maxResults', 50)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_id}/context/projectmapping'.format(field_id='field_id_example'),
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_custom_field_context_from_projects(self):
        """Test case for remove_custom_field_context_from_projects

        Remove custom field context from projects
        """
        project_ids = {"projectIds":["projectIds","projectIds"]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_id}/context/{context_id}/project/remove'.format(field_id='field_id_example', context_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(project_ids),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_remove_issue_types_from_context(self):
        """Test case for remove_issue_types_from_context

        Remove issue types from context
        """
        issue_type_ids = {"issueTypeIds":["issueTypeIds","issueTypeIds"]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_id}/context/{context_id}/issuetype/remove'.format(field_id='field_id_example', context_id=56),
            method='POST',
            headers=headers,
            data=json.dumps(issue_type_ids),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_set_default_values(self):
        """Test case for set_default_values

        Set custom field contexts default values
        """
        custom_field_context_default_value_update = {"defaultValues":[null,null]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_id}/context/defaultValue'.format(field_id='field_id_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(custom_field_context_default_value_update),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_custom_field_context(self):
        """Test case for update_custom_field_context

        Update custom field context
        """
        custom_field_context_update_details = {"name":"name","description":"description"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/field/{field_id}/context/{context_id}'.format(field_id='field_id_example', context_id=56),
            method='PUT',
            headers=headers,
            data=json.dumps(custom_field_context_update_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
