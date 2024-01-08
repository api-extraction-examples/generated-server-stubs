import unittest

from flask import json

from openapi_server.models.found_users_and_groups import FoundUsersAndGroups  # noqa: E501
from openapi_server.test import BaseTestCase


class TestGroupAndUserPickerController(BaseTestCase):
    """GroupAndUserPickerController integration test stubs"""

    def test_find_users_and_groups(self):
        """Test case for find_users_and_groups

        Find users and groups
        """
        query_string = [('query', 'query_example'),
                        ('maxResults', 50),
                        ('showAvatar', False),
                        ('fieldId', 'field_id_example'),
                        ('projectId', ['project_id_example']),
                        ('issueTypeId', ['issue_type_id_example']),
                        ('avatarSize', 'xsmall'),
                        ('caseInsensitive', False),
                        ('excludeConnectAddons', False)]
        headers = { 
            'Accept': 'application/json',
            'Authorization': 'Bearer special-key',
            'Authorization': 'Basic Zm9vOmJhcg==',
        }
        response = self.client.open(
            '/rest/api/3/groupuserpicker',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
