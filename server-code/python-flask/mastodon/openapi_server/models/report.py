from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.account import Account
from openapi_server import util

from openapi_server.models.account import Account  # noqa: E501

class Report(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, action_taken=None, action_taken_at=None, category=None, comment=None, created_at=None, forwarded=None, id=None, rule_ids=None, status_ids=None, target_account=None):  # noqa: E501
        """Report - a model defined in OpenAPI

        :param action_taken: The action_taken of this Report.  # noqa: E501
        :type action_taken: bool
        :param action_taken_at: The action_taken_at of this Report.  # noqa: E501
        :type action_taken_at: datetime
        :param category: The category of this Report.  # noqa: E501
        :type category: str
        :param comment: The comment of this Report.  # noqa: E501
        :type comment: str
        :param created_at: The created_at of this Report.  # noqa: E501
        :type created_at: datetime
        :param forwarded: The forwarded of this Report.  # noqa: E501
        :type forwarded: bool
        :param id: The id of this Report.  # noqa: E501
        :type id: str
        :param rule_ids: The rule_ids of this Report.  # noqa: E501
        :type rule_ids: List[int]
        :param status_ids: The status_ids of this Report.  # noqa: E501
        :type status_ids: List[int]
        :param target_account: The target_account of this Report.  # noqa: E501
        :type target_account: Account
        """
        self.openapi_types = {
            'action_taken': bool,
            'action_taken_at': datetime,
            'category': str,
            'comment': str,
            'created_at': datetime,
            'forwarded': bool,
            'id': str,
            'rule_ids': List[int],
            'status_ids': List[int],
            'target_account': Account
        }

        self.attribute_map = {
            'action_taken': 'action_taken',
            'action_taken_at': 'action_taken_at',
            'category': 'category',
            'comment': 'comment',
            'created_at': 'created_at',
            'forwarded': 'forwarded',
            'id': 'id',
            'rule_ids': 'rule_ids',
            'status_ids': 'status_ids',
            'target_account': 'target_account'
        }

        self._action_taken = action_taken
        self._action_taken_at = action_taken_at
        self._category = category
        self._comment = comment
        self._created_at = created_at
        self._forwarded = forwarded
        self._id = id
        self._rule_ids = rule_ids
        self._status_ids = status_ids
        self._target_account = target_account

    @classmethod
    def from_dict(cls, dikt) -> 'Report':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Report of this Report.  # noqa: E501
        :rtype: Report
        """
        return util.deserialize_model(dikt, cls)

    @property
    def action_taken(self) -> bool:
        """Gets the action_taken of this Report.


        :return: The action_taken of this Report.
        :rtype: bool
        """
        return self._action_taken

    @action_taken.setter
    def action_taken(self, action_taken: bool):
        """Sets the action_taken of this Report.


        :param action_taken: The action_taken of this Report.
        :type action_taken: bool
        """

        self._action_taken = action_taken

    @property
    def action_taken_at(self) -> datetime:
        """Gets the action_taken_at of this Report.


        :return: The action_taken_at of this Report.
        :rtype: datetime
        """
        return self._action_taken_at

    @action_taken_at.setter
    def action_taken_at(self, action_taken_at: datetime):
        """Sets the action_taken_at of this Report.


        :param action_taken_at: The action_taken_at of this Report.
        :type action_taken_at: datetime
        """

        self._action_taken_at = action_taken_at

    @property
    def category(self) -> str:
        """Gets the category of this Report.


        :return: The category of this Report.
        :rtype: str
        """
        return self._category

    @category.setter
    def category(self, category: str):
        """Sets the category of this Report.


        :param category: The category of this Report.
        :type category: str
        """
        allowed_values = ["other", "spam", "violation"]  # noqa: E501
        if category not in allowed_values:
            raise ValueError(
                "Invalid value for `category` ({0}), must be one of {1}"
                .format(category, allowed_values)
            )

        self._category = category

    @property
    def comment(self) -> str:
        """Gets the comment of this Report.


        :return: The comment of this Report.
        :rtype: str
        """
        return self._comment

    @comment.setter
    def comment(self, comment: str):
        """Sets the comment of this Report.


        :param comment: The comment of this Report.
        :type comment: str
        """

        self._comment = comment

    @property
    def created_at(self) -> datetime:
        """Gets the created_at of this Report.


        :return: The created_at of this Report.
        :rtype: datetime
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at: datetime):
        """Sets the created_at of this Report.


        :param created_at: The created_at of this Report.
        :type created_at: datetime
        """

        self._created_at = created_at

    @property
    def forwarded(self) -> bool:
        """Gets the forwarded of this Report.


        :return: The forwarded of this Report.
        :rtype: bool
        """
        return self._forwarded

    @forwarded.setter
    def forwarded(self, forwarded: bool):
        """Sets the forwarded of this Report.


        :param forwarded: The forwarded of this Report.
        :type forwarded: bool
        """

        self._forwarded = forwarded

    @property
    def id(self) -> str:
        """Gets the id of this Report.


        :return: The id of this Report.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this Report.


        :param id: The id of this Report.
        :type id: str
        """

        self._id = id

    @property
    def rule_ids(self) -> List[int]:
        """Gets the rule_ids of this Report.


        :return: The rule_ids of this Report.
        :rtype: List[int]
        """
        return self._rule_ids

    @rule_ids.setter
    def rule_ids(self, rule_ids: List[int]):
        """Sets the rule_ids of this Report.


        :param rule_ids: The rule_ids of this Report.
        :type rule_ids: List[int]
        """

        self._rule_ids = rule_ids

    @property
    def status_ids(self) -> List[int]:
        """Gets the status_ids of this Report.


        :return: The status_ids of this Report.
        :rtype: List[int]
        """
        return self._status_ids

    @status_ids.setter
    def status_ids(self, status_ids: List[int]):
        """Sets the status_ids of this Report.


        :param status_ids: The status_ids of this Report.
        :type status_ids: List[int]
        """

        self._status_ids = status_ids

    @property
    def target_account(self) -> Account:
        """Gets the target_account of this Report.


        :return: The target_account of this Report.
        :rtype: Account
        """
        return self._target_account

    @target_account.setter
    def target_account(self, target_account: Account):
        """Sets the target_account of this Report.


        :param target_account: The target_account of this Report.
        :type target_account: Account
        """

        self._target_account = target_account
