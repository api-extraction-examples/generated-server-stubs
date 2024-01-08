from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.fields_assignee import FieldsAssignee
from openapi_server.models.fields_issue_type import FieldsIssueType
from openapi_server.models.fields_priority import FieldsPriority
from openapi_server.models.fields_status import FieldsStatus
from openapi_server.models.fields_timetracking import FieldsTimetracking
from openapi_server.models.issue_type_details import IssueTypeDetails
from openapi_server import util

from openapi_server.models.fields_assignee import FieldsAssignee  # noqa: E501
from openapi_server.models.fields_issue_type import FieldsIssueType  # noqa: E501
from openapi_server.models.fields_priority import FieldsPriority  # noqa: E501
from openapi_server.models.fields_status import FieldsStatus  # noqa: E501
from openapi_server.models.fields_timetracking import FieldsTimetracking  # noqa: E501
from openapi_server.models.issue_type_details import IssueTypeDetails  # noqa: E501

class LinkedIssueFields(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, assignee=None, issue_type=None, issuetype=None, priority=None, status=None, summary=None, timetracking=None):  # noqa: E501
        """LinkedIssueFields - a model defined in OpenAPI

        :param assignee: The assignee of this LinkedIssueFields.  # noqa: E501
        :type assignee: FieldsAssignee
        :param issue_type: The issue_type of this LinkedIssueFields.  # noqa: E501
        :type issue_type: FieldsIssueType
        :param issuetype: The issuetype of this LinkedIssueFields.  # noqa: E501
        :type issuetype: IssueTypeDetails
        :param priority: The priority of this LinkedIssueFields.  # noqa: E501
        :type priority: FieldsPriority
        :param status: The status of this LinkedIssueFields.  # noqa: E501
        :type status: FieldsStatus
        :param summary: The summary of this LinkedIssueFields.  # noqa: E501
        :type summary: str
        :param timetracking: The timetracking of this LinkedIssueFields.  # noqa: E501
        :type timetracking: FieldsTimetracking
        """
        self.openapi_types = {
            'assignee': FieldsAssignee,
            'issue_type': FieldsIssueType,
            'issuetype': IssueTypeDetails,
            'priority': FieldsPriority,
            'status': FieldsStatus,
            'summary': str,
            'timetracking': FieldsTimetracking
        }

        self.attribute_map = {
            'assignee': 'assignee',
            'issue_type': 'issueType',
            'issuetype': 'issuetype',
            'priority': 'priority',
            'status': 'status',
            'summary': 'summary',
            'timetracking': 'timetracking'
        }

        self._assignee = assignee
        self._issue_type = issue_type
        self._issuetype = issuetype
        self._priority = priority
        self._status = status
        self._summary = summary
        self._timetracking = timetracking

    @classmethod
    def from_dict(cls, dikt) -> 'LinkedIssueFields':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The LinkedIssue_fields of this LinkedIssueFields.  # noqa: E501
        :rtype: LinkedIssueFields
        """
        return util.deserialize_model(dikt, cls)

    @property
    def assignee(self) -> FieldsAssignee:
        """Gets the assignee of this LinkedIssueFields.


        :return: The assignee of this LinkedIssueFields.
        :rtype: FieldsAssignee
        """
        return self._assignee

    @assignee.setter
    def assignee(self, assignee: FieldsAssignee):
        """Sets the assignee of this LinkedIssueFields.


        :param assignee: The assignee of this LinkedIssueFields.
        :type assignee: FieldsAssignee
        """

        self._assignee = assignee

    @property
    def issue_type(self) -> FieldsIssueType:
        """Gets the issue_type of this LinkedIssueFields.


        :return: The issue_type of this LinkedIssueFields.
        :rtype: FieldsIssueType
        """
        return self._issue_type

    @issue_type.setter
    def issue_type(self, issue_type: FieldsIssueType):
        """Sets the issue_type of this LinkedIssueFields.


        :param issue_type: The issue_type of this LinkedIssueFields.
        :type issue_type: FieldsIssueType
        """

        self._issue_type = issue_type

    @property
    def issuetype(self) -> IssueTypeDetails:
        """Gets the issuetype of this LinkedIssueFields.


        :return: The issuetype of this LinkedIssueFields.
        :rtype: IssueTypeDetails
        """
        return self._issuetype

    @issuetype.setter
    def issuetype(self, issuetype: IssueTypeDetails):
        """Sets the issuetype of this LinkedIssueFields.


        :param issuetype: The issuetype of this LinkedIssueFields.
        :type issuetype: IssueTypeDetails
        """

        self._issuetype = issuetype

    @property
    def priority(self) -> FieldsPriority:
        """Gets the priority of this LinkedIssueFields.


        :return: The priority of this LinkedIssueFields.
        :rtype: FieldsPriority
        """
        return self._priority

    @priority.setter
    def priority(self, priority: FieldsPriority):
        """Sets the priority of this LinkedIssueFields.


        :param priority: The priority of this LinkedIssueFields.
        :type priority: FieldsPriority
        """

        self._priority = priority

    @property
    def status(self) -> FieldsStatus:
        """Gets the status of this LinkedIssueFields.


        :return: The status of this LinkedIssueFields.
        :rtype: FieldsStatus
        """
        return self._status

    @status.setter
    def status(self, status: FieldsStatus):
        """Sets the status of this LinkedIssueFields.


        :param status: The status of this LinkedIssueFields.
        :type status: FieldsStatus
        """

        self._status = status

    @property
    def summary(self) -> str:
        """Gets the summary of this LinkedIssueFields.

        The summary description of the linked issue.  # noqa: E501

        :return: The summary of this LinkedIssueFields.
        :rtype: str
        """
        return self._summary

    @summary.setter
    def summary(self, summary: str):
        """Sets the summary of this LinkedIssueFields.

        The summary description of the linked issue.  # noqa: E501

        :param summary: The summary of this LinkedIssueFields.
        :type summary: str
        """

        self._summary = summary

    @property
    def timetracking(self) -> FieldsTimetracking:
        """Gets the timetracking of this LinkedIssueFields.


        :return: The timetracking of this LinkedIssueFields.
        :rtype: FieldsTimetracking
        """
        return self._timetracking

    @timetracking.setter
    def timetracking(self, timetracking: FieldsTimetracking):
        """Sets the timetracking of this LinkedIssueFields.


        :param timetracking: The timetracking of this LinkedIssueFields.
        :type timetracking: FieldsTimetracking
        """

        self._timetracking = timetracking