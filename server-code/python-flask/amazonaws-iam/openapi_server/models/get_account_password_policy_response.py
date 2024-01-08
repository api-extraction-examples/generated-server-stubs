from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.get_account_password_policy_response_password_policy import GetAccountPasswordPolicyResponsePasswordPolicy
from openapi_server import util

from openapi_server.models.get_account_password_policy_response_password_policy import GetAccountPasswordPolicyResponsePasswordPolicy  # noqa: E501

class GetAccountPasswordPolicyResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, password_policy=None):  # noqa: E501
        """GetAccountPasswordPolicyResponse - a model defined in OpenAPI

        :param password_policy: The password_policy of this GetAccountPasswordPolicyResponse.  # noqa: E501
        :type password_policy: GetAccountPasswordPolicyResponsePasswordPolicy
        """
        self.openapi_types = {
            'password_policy': GetAccountPasswordPolicyResponsePasswordPolicy
        }

        self.attribute_map = {
            'password_policy': 'PasswordPolicy'
        }

        self._password_policy = password_policy

    @classmethod
    def from_dict(cls, dikt) -> 'GetAccountPasswordPolicyResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The GetAccountPasswordPolicyResponse of this GetAccountPasswordPolicyResponse.  # noqa: E501
        :rtype: GetAccountPasswordPolicyResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def password_policy(self) -> GetAccountPasswordPolicyResponsePasswordPolicy:
        """Gets the password_policy of this GetAccountPasswordPolicyResponse.


        :return: The password_policy of this GetAccountPasswordPolicyResponse.
        :rtype: GetAccountPasswordPolicyResponsePasswordPolicy
        """
        return self._password_policy

    @password_policy.setter
    def password_policy(self, password_policy: GetAccountPasswordPolicyResponsePasswordPolicy):
        """Sets the password_policy of this GetAccountPasswordPolicyResponse.


        :param password_policy: The password_policy of this GetAccountPasswordPolicyResponse.
        :type password_policy: GetAccountPasswordPolicyResponsePasswordPolicy
        """
        if password_policy is None:
            raise ValueError("Invalid value for `password_policy`, must not be `None`")  # noqa: E501

        self._password_policy = password_policy
