import unittest

from flask import json

from openapi_server.models.connect_custom_field_values import ConnectCustomFieldValues  # noqa: E501
from openapi_server.models.entity_property_details import EntityPropertyDetails  # noqa: E501
from openapi_server.models.workflow_rules_search import WorkflowRulesSearch  # noqa: E501
from openapi_server.models.workflow_rules_search_details import WorkflowRulesSearchDetails  # noqa: E501
from openapi_server.test import BaseTestCase


class TestAppMigrationController(BaseTestCase):
    """AppMigrationController integration test stubs"""

    def test_app_issue_field_value_update_resource_update_issue_fields_put(self):
        """Test case for app_issue_field_value_update_resource_update_issue_fields_put

        Bulk update custom field value
        """
        connect_custom_field_values = {"updateValueList":[{"number":1.4658129805029452,"issueID":6,"string":"string","_type":"StringIssueField","optionID":"optionID","text":"text","richText":"richText","fieldID":0},{"number":1.4658129805029452,"issueID":6,"string":"string","_type":"StringIssueField","optionID":"optionID","text":"text","richText":"richText","fieldID":0}]}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'atlassian_transfer_id': 'atlassian_transfer_id_example',
        }
        response = self.client.open(
            '/rest/atlassian-connect/1/migration/field',
            method='PUT',
            headers=headers,
            data=json.dumps(connect_custom_field_values),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_migration_resource_update_entity_properties_value_put(self):
        """Test case for migration_resource_update_entity_properties_value_put

        Bulk update entity properties
        """
        entity_property_details = {"entityId":123,"value":"newValue","key":"mykey"}
        headers = { 
            'Content-Type': 'application/json',
            'atlassian_transfer_id': 'atlassian_transfer_id_example',
        }
        response = self.client.open(
            '/rest/atlassian-connect/1/migration/properties/{entity_type}'.format(entity_type='entity_type_example'),
            method='PUT',
            headers=headers,
            data=json.dumps(entity_property_details),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_migration_resource_workflow_rule_search_post(self):
        """Test case for migration_resource_workflow_rule_search_post

        Get workflow transition rule configurations
        """
        workflow_rules_search = {"expand":"transition","ruleIds":["55d44f1d-c859-42e5-9c27-2c5ec3f340b1","55d44f1d-c859-42e5-9c27-2c5ec3f340b1","55d44f1d-c859-42e5-9c27-2c5ec3f340b1","55d44f1d-c859-42e5-9c27-2c5ec3f340b1","55d44f1d-c859-42e5-9c27-2c5ec3f340b1"],"workflowEntityId":"a498d711-685d-428d-8c3e-bc03bb450ea7"}
        headers = { 
            'Accept': 'application/json',
            'Content-Type': 'application/json',
            'atlassian_transfer_id': 'atlassian_transfer_id_example',
        }
        response = self.client.open(
            '/rest/atlassian-connect/1/migration/workflow/rule/search',
            method='POST',
            headers=headers,
            data=json.dumps(workflow_rules_search),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
