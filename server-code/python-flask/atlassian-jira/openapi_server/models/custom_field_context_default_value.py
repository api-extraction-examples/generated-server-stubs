from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.custom_field_context_default_value_cascading_option import CustomFieldContextDefaultValueCascadingOption
from openapi_server.models.custom_field_context_default_value_date import CustomFieldContextDefaultValueDate
from openapi_server.models.custom_field_context_default_value_date_time import CustomFieldContextDefaultValueDateTime
from openapi_server.models.custom_field_context_default_value_float import CustomFieldContextDefaultValueFloat
from openapi_server.models.custom_field_context_default_value_forge_date_time_field import CustomFieldContextDefaultValueForgeDateTimeField
from openapi_server.models.custom_field_context_default_value_forge_group_field import CustomFieldContextDefaultValueForgeGroupField
from openapi_server.models.custom_field_context_default_value_forge_multi_group_field import CustomFieldContextDefaultValueForgeMultiGroupField
from openapi_server.models.custom_field_context_default_value_forge_multi_string_field import CustomFieldContextDefaultValueForgeMultiStringField
from openapi_server.models.custom_field_context_default_value_forge_multi_user_field import CustomFieldContextDefaultValueForgeMultiUserField
from openapi_server.models.custom_field_context_default_value_forge_number_field import CustomFieldContextDefaultValueForgeNumberField
from openapi_server.models.custom_field_context_default_value_forge_object_field import CustomFieldContextDefaultValueForgeObjectField
from openapi_server.models.custom_field_context_default_value_forge_string_field import CustomFieldContextDefaultValueForgeStringField
from openapi_server.models.custom_field_context_default_value_forge_user_field import CustomFieldContextDefaultValueForgeUserField
from openapi_server.models.custom_field_context_default_value_labels import CustomFieldContextDefaultValueLabels
from openapi_server.models.custom_field_context_default_value_multi_user_picker import CustomFieldContextDefaultValueMultiUserPicker
from openapi_server.models.custom_field_context_default_value_multiple_group_picker import CustomFieldContextDefaultValueMultipleGroupPicker
from openapi_server.models.custom_field_context_default_value_multiple_option import CustomFieldContextDefaultValueMultipleOption
from openapi_server.models.custom_field_context_default_value_multiple_version_picker import CustomFieldContextDefaultValueMultipleVersionPicker
from openapi_server.models.custom_field_context_default_value_project import CustomFieldContextDefaultValueProject
from openapi_server.models.custom_field_context_default_value_read_only import CustomFieldContextDefaultValueReadOnly
from openapi_server.models.custom_field_context_default_value_single_group_picker import CustomFieldContextDefaultValueSingleGroupPicker
from openapi_server.models.custom_field_context_default_value_single_option import CustomFieldContextDefaultValueSingleOption
from openapi_server.models.custom_field_context_default_value_single_version_picker import CustomFieldContextDefaultValueSingleVersionPicker
from openapi_server.models.custom_field_context_default_value_text_area import CustomFieldContextDefaultValueTextArea
from openapi_server.models.custom_field_context_default_value_text_field import CustomFieldContextDefaultValueTextField
from openapi_server.models.custom_field_context_default_value_url import CustomFieldContextDefaultValueURL
from openapi_server.models.custom_field_context_single_user_picker_defaults import CustomFieldContextSingleUserPickerDefaults
from openapi_server.models.user_filter import UserFilter
from openapi_server import util

from openapi_server.models.custom_field_context_default_value_cascading_option import CustomFieldContextDefaultValueCascadingOption  # noqa: E501
from openapi_server.models.custom_field_context_default_value_date import CustomFieldContextDefaultValueDate  # noqa: E501
from openapi_server.models.custom_field_context_default_value_date_time import CustomFieldContextDefaultValueDateTime  # noqa: E501
from openapi_server.models.custom_field_context_default_value_float import CustomFieldContextDefaultValueFloat  # noqa: E501
from openapi_server.models.custom_field_context_default_value_forge_date_time_field import CustomFieldContextDefaultValueForgeDateTimeField  # noqa: E501
from openapi_server.models.custom_field_context_default_value_forge_group_field import CustomFieldContextDefaultValueForgeGroupField  # noqa: E501
from openapi_server.models.custom_field_context_default_value_forge_multi_group_field import CustomFieldContextDefaultValueForgeMultiGroupField  # noqa: E501
from openapi_server.models.custom_field_context_default_value_forge_multi_string_field import CustomFieldContextDefaultValueForgeMultiStringField  # noqa: E501
from openapi_server.models.custom_field_context_default_value_forge_multi_user_field import CustomFieldContextDefaultValueForgeMultiUserField  # noqa: E501
from openapi_server.models.custom_field_context_default_value_forge_number_field import CustomFieldContextDefaultValueForgeNumberField  # noqa: E501
from openapi_server.models.custom_field_context_default_value_forge_object_field import CustomFieldContextDefaultValueForgeObjectField  # noqa: E501
from openapi_server.models.custom_field_context_default_value_forge_string_field import CustomFieldContextDefaultValueForgeStringField  # noqa: E501
from openapi_server.models.custom_field_context_default_value_forge_user_field import CustomFieldContextDefaultValueForgeUserField  # noqa: E501
from openapi_server.models.custom_field_context_default_value_labels import CustomFieldContextDefaultValueLabels  # noqa: E501
from openapi_server.models.custom_field_context_default_value_multi_user_picker import CustomFieldContextDefaultValueMultiUserPicker  # noqa: E501
from openapi_server.models.custom_field_context_default_value_multiple_group_picker import CustomFieldContextDefaultValueMultipleGroupPicker  # noqa: E501
from openapi_server.models.custom_field_context_default_value_multiple_option import CustomFieldContextDefaultValueMultipleOption  # noqa: E501
from openapi_server.models.custom_field_context_default_value_multiple_version_picker import CustomFieldContextDefaultValueMultipleVersionPicker  # noqa: E501
from openapi_server.models.custom_field_context_default_value_project import CustomFieldContextDefaultValueProject  # noqa: E501
from openapi_server.models.custom_field_context_default_value_read_only import CustomFieldContextDefaultValueReadOnly  # noqa: E501
from openapi_server.models.custom_field_context_default_value_single_group_picker import CustomFieldContextDefaultValueSingleGroupPicker  # noqa: E501
from openapi_server.models.custom_field_context_default_value_single_option import CustomFieldContextDefaultValueSingleOption  # noqa: E501
from openapi_server.models.custom_field_context_default_value_single_version_picker import CustomFieldContextDefaultValueSingleVersionPicker  # noqa: E501
from openapi_server.models.custom_field_context_default_value_text_area import CustomFieldContextDefaultValueTextArea  # noqa: E501
from openapi_server.models.custom_field_context_default_value_text_field import CustomFieldContextDefaultValueTextField  # noqa: E501
from openapi_server.models.custom_field_context_default_value_url import CustomFieldContextDefaultValueURL  # noqa: E501
from openapi_server.models.custom_field_context_single_user_picker_defaults import CustomFieldContextSingleUserPickerDefaults  # noqa: E501
from openapi_server.models.user_filter import UserFilter  # noqa: E501

class CustomFieldContextDefaultValue(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, cascading_option_id=None, context_id=None, option_id=None, type=None, option_ids=None, account_id=None, user_filter=None, account_ids=None, group_id=None, group_ids=None, _date=None, use_current=False, date_time=None, url=None, project_id=None, number=None, labels=None, text=None, version_id=None, version_order=None, version_ids=None, values=None, object=None):  # noqa: E501
        """CustomFieldContextDefaultValue - a model defined in OpenAPI

        :param cascading_option_id: The cascading_option_id of this CustomFieldContextDefaultValue.  # noqa: E501
        :type cascading_option_id: str
        :param context_id: The context_id of this CustomFieldContextDefaultValue.  # noqa: E501
        :type context_id: str
        :param option_id: The option_id of this CustomFieldContextDefaultValue.  # noqa: E501
        :type option_id: str
        :param type: The type of this CustomFieldContextDefaultValue.  # noqa: E501
        :type type: str
        :param option_ids: The option_ids of this CustomFieldContextDefaultValue.  # noqa: E501
        :type option_ids: List[str]
        :param account_id: The account_id of this CustomFieldContextDefaultValue.  # noqa: E501
        :type account_id: str
        :param user_filter: The user_filter of this CustomFieldContextDefaultValue.  # noqa: E501
        :type user_filter: UserFilter
        :param account_ids: The account_ids of this CustomFieldContextDefaultValue.  # noqa: E501
        :type account_ids: List[str]
        :param group_id: The group_id of this CustomFieldContextDefaultValue.  # noqa: E501
        :type group_id: str
        :param group_ids: The group_ids of this CustomFieldContextDefaultValue.  # noqa: E501
        :type group_ids: list[str]
        :param _date: The _date of this CustomFieldContextDefaultValue.  # noqa: E501
        :type _date: str
        :param use_current: The use_current of this CustomFieldContextDefaultValue.  # noqa: E501
        :type use_current: bool
        :param date_time: The date_time of this CustomFieldContextDefaultValue.  # noqa: E501
        :type date_time: str
        :param url: The url of this CustomFieldContextDefaultValue.  # noqa: E501
        :type url: str
        :param project_id: The project_id of this CustomFieldContextDefaultValue.  # noqa: E501
        :type project_id: str
        :param number: The number of this CustomFieldContextDefaultValue.  # noqa: E501
        :type number: float
        :param labels: The labels of this CustomFieldContextDefaultValue.  # noqa: E501
        :type labels: List[str]
        :param text: The text of this CustomFieldContextDefaultValue.  # noqa: E501
        :type text: str
        :param version_id: The version_id of this CustomFieldContextDefaultValue.  # noqa: E501
        :type version_id: str
        :param version_order: The version_order of this CustomFieldContextDefaultValue.  # noqa: E501
        :type version_order: str
        :param version_ids: The version_ids of this CustomFieldContextDefaultValue.  # noqa: E501
        :type version_ids: list[str]
        :param values: The values of this CustomFieldContextDefaultValue.  # noqa: E501
        :type values: List[str]
        :param object: The object of this CustomFieldContextDefaultValue.  # noqa: E501
        :type object: object
        """
        self.openapi_types = {
            'cascading_option_id': str,
            'context_id': str,
            'option_id': str,
            'type': str,
            'option_ids': List[str],
            'account_id': str,
            'user_filter': UserFilter,
            'account_ids': List[str],
            'group_id': str,
            'group_ids': list[str],
            '_date': str,
            'use_current': bool,
            'date_time': str,
            'url': str,
            'project_id': str,
            'number': float,
            'labels': List[str],
            'text': str,
            'version_id': str,
            'version_order': str,
            'version_ids': list[str],
            'values': List[str],
            'object': object
        }

        self.attribute_map = {
            'cascading_option_id': 'cascadingOptionId',
            'context_id': 'contextId',
            'option_id': 'optionId',
            'type': 'type',
            'option_ids': 'optionIds',
            'account_id': 'accountId',
            'user_filter': 'userFilter',
            'account_ids': 'accountIds',
            'group_id': 'groupId',
            'group_ids': 'groupIds',
            '_date': 'date',
            'use_current': 'useCurrent',
            'date_time': 'dateTime',
            'url': 'url',
            'project_id': 'projectId',
            'number': 'number',
            'labels': 'labels',
            'text': 'text',
            'version_id': 'versionId',
            'version_order': 'versionOrder',
            'version_ids': 'versionIds',
            'values': 'values',
            'object': 'object'
        }

        self._cascading_option_id = cascading_option_id
        self._context_id = context_id
        self._option_id = option_id
        self._type = type
        self._option_ids = option_ids
        self._account_id = account_id
        self._user_filter = user_filter
        self._account_ids = account_ids
        self._group_id = group_id
        self._group_ids = group_ids
        self.__date = _date
        self._use_current = use_current
        self._date_time = date_time
        self._url = url
        self._project_id = project_id
        self._number = number
        self._labels = labels
        self._text = text
        self._version_id = version_id
        self._version_order = version_order
        self._version_ids = version_ids
        self._values = values
        self._object = object

    @classmethod
    def from_dict(cls, dikt) -> 'CustomFieldContextDefaultValue':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CustomFieldContextDefaultValue of this CustomFieldContextDefaultValue.  # noqa: E501
        :rtype: CustomFieldContextDefaultValue
        """
        return util.deserialize_model(dikt, cls)

    @property
    def cascading_option_id(self) -> str:
        """Gets the cascading_option_id of this CustomFieldContextDefaultValue.

        The ID of the default cascading option.  # noqa: E501

        :return: The cascading_option_id of this CustomFieldContextDefaultValue.
        :rtype: str
        """
        return self._cascading_option_id

    @cascading_option_id.setter
    def cascading_option_id(self, cascading_option_id: str):
        """Sets the cascading_option_id of this CustomFieldContextDefaultValue.

        The ID of the default cascading option.  # noqa: E501

        :param cascading_option_id: The cascading_option_id of this CustomFieldContextDefaultValue.
        :type cascading_option_id: str
        """

        self._cascading_option_id = cascading_option_id

    @property
    def context_id(self) -> str:
        """Gets the context_id of this CustomFieldContextDefaultValue.

        The ID of the context.  # noqa: E501

        :return: The context_id of this CustomFieldContextDefaultValue.
        :rtype: str
        """
        return self._context_id

    @context_id.setter
    def context_id(self, context_id: str):
        """Sets the context_id of this CustomFieldContextDefaultValue.

        The ID of the context.  # noqa: E501

        :param context_id: The context_id of this CustomFieldContextDefaultValue.
        :type context_id: str
        """
        if context_id is None:
            raise ValueError("Invalid value for `context_id`, must not be `None`")  # noqa: E501

        self._context_id = context_id

    @property
    def option_id(self) -> str:
        """Gets the option_id of this CustomFieldContextDefaultValue.

        The ID of the default option.  # noqa: E501

        :return: The option_id of this CustomFieldContextDefaultValue.
        :rtype: str
        """
        return self._option_id

    @option_id.setter
    def option_id(self, option_id: str):
        """Sets the option_id of this CustomFieldContextDefaultValue.

        The ID of the default option.  # noqa: E501

        :param option_id: The option_id of this CustomFieldContextDefaultValue.
        :type option_id: str
        """
        if option_id is None:
            raise ValueError("Invalid value for `option_id`, must not be `None`")  # noqa: E501

        self._option_id = option_id

    @property
    def type(self) -> str:
        """Gets the type of this CustomFieldContextDefaultValue.


        :return: The type of this CustomFieldContextDefaultValue.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this CustomFieldContextDefaultValue.


        :param type: The type of this CustomFieldContextDefaultValue.
        :type type: str
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")  # noqa: E501

        self._type = type

    @property
    def option_ids(self) -> List[str]:
        """Gets the option_ids of this CustomFieldContextDefaultValue.

        The list of IDs of the default options.  # noqa: E501

        :return: The option_ids of this CustomFieldContextDefaultValue.
        :rtype: List[str]
        """
        return self._option_ids

    @option_ids.setter
    def option_ids(self, option_ids: List[str]):
        """Sets the option_ids of this CustomFieldContextDefaultValue.

        The list of IDs of the default options.  # noqa: E501

        :param option_ids: The option_ids of this CustomFieldContextDefaultValue.
        :type option_ids: List[str]
        """
        if option_ids is None:
            raise ValueError("Invalid value for `option_ids`, must not be `None`")  # noqa: E501

        self._option_ids = option_ids

    @property
    def account_id(self) -> str:
        """Gets the account_id of this CustomFieldContextDefaultValue.

        The ID of the default user.  # noqa: E501

        :return: The account_id of this CustomFieldContextDefaultValue.
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id: str):
        """Sets the account_id of this CustomFieldContextDefaultValue.

        The ID of the default user.  # noqa: E501

        :param account_id: The account_id of this CustomFieldContextDefaultValue.
        :type account_id: str
        """
        if account_id is None:
            raise ValueError("Invalid value for `account_id`, must not be `None`")  # noqa: E501

        self._account_id = account_id

    @property
    def user_filter(self) -> UserFilter:
        """Gets the user_filter of this CustomFieldContextDefaultValue.


        :return: The user_filter of this CustomFieldContextDefaultValue.
        :rtype: UserFilter
        """
        return self._user_filter

    @user_filter.setter
    def user_filter(self, user_filter: UserFilter):
        """Sets the user_filter of this CustomFieldContextDefaultValue.


        :param user_filter: The user_filter of this CustomFieldContextDefaultValue.
        :type user_filter: UserFilter
        """
        if user_filter is None:
            raise ValueError("Invalid value for `user_filter`, must not be `None`")  # noqa: E501

        self._user_filter = user_filter

    @property
    def account_ids(self) -> List[str]:
        """Gets the account_ids of this CustomFieldContextDefaultValue.

        The IDs of the default users.  # noqa: E501

        :return: The account_ids of this CustomFieldContextDefaultValue.
        :rtype: List[str]
        """
        return self._account_ids

    @account_ids.setter
    def account_ids(self, account_ids: List[str]):
        """Sets the account_ids of this CustomFieldContextDefaultValue.

        The IDs of the default users.  # noqa: E501

        :param account_ids: The account_ids of this CustomFieldContextDefaultValue.
        :type account_ids: List[str]
        """
        if account_ids is None:
            raise ValueError("Invalid value for `account_ids`, must not be `None`")  # noqa: E501

        self._account_ids = account_ids

    @property
    def group_id(self) -> str:
        """Gets the group_id of this CustomFieldContextDefaultValue.

        The ID of the the default group.  # noqa: E501

        :return: The group_id of this CustomFieldContextDefaultValue.
        :rtype: str
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id: str):
        """Sets the group_id of this CustomFieldContextDefaultValue.

        The ID of the the default group.  # noqa: E501

        :param group_id: The group_id of this CustomFieldContextDefaultValue.
        :type group_id: str
        """
        if group_id is None:
            raise ValueError("Invalid value for `group_id`, must not be `None`")  # noqa: E501

        self._group_id = group_id

    @property
    def group_ids(self) -> list[str]:
        """Gets the group_ids of this CustomFieldContextDefaultValue.

        The IDs of the default groups.  # noqa: E501

        :return: The group_ids of this CustomFieldContextDefaultValue.
        :rtype: list[str]
        """
        return self._group_ids

    @group_ids.setter
    def group_ids(self, group_ids: list[str]):
        """Sets the group_ids of this CustomFieldContextDefaultValue.

        The IDs of the default groups.  # noqa: E501

        :param group_ids: The group_ids of this CustomFieldContextDefaultValue.
        :type group_ids: list[str]
        """
        if group_ids is None:
            raise ValueError("Invalid value for `group_ids`, must not be `None`")  # noqa: E501

        self._group_ids = group_ids

    @property
    def _date(self) -> str:
        """Gets the _date of this CustomFieldContextDefaultValue.

        The default date in ISO format. Ignored if `useCurrent` is true.  # noqa: E501

        :return: The _date of this CustomFieldContextDefaultValue.
        :rtype: str
        """
        return self.__date

    @_date.setter
    def _date(self, _date: str):
        """Sets the _date of this CustomFieldContextDefaultValue.

        The default date in ISO format. Ignored if `useCurrent` is true.  # noqa: E501

        :param _date: The _date of this CustomFieldContextDefaultValue.
        :type _date: str
        """

        self.__date = _date

    @property
    def use_current(self) -> bool:
        """Gets the use_current of this CustomFieldContextDefaultValue.

        Whether to use the current date.  # noqa: E501

        :return: The use_current of this CustomFieldContextDefaultValue.
        :rtype: bool
        """
        return self._use_current

    @use_current.setter
    def use_current(self, use_current: bool):
        """Sets the use_current of this CustomFieldContextDefaultValue.

        Whether to use the current date.  # noqa: E501

        :param use_current: The use_current of this CustomFieldContextDefaultValue.
        :type use_current: bool
        """

        self._use_current = use_current

    @property
    def date_time(self) -> str:
        """Gets the date_time of this CustomFieldContextDefaultValue.

        The default date-time in ISO format. Ignored if `useCurrent` is true.  # noqa: E501

        :return: The date_time of this CustomFieldContextDefaultValue.
        :rtype: str
        """
        return self._date_time

    @date_time.setter
    def date_time(self, date_time: str):
        """Sets the date_time of this CustomFieldContextDefaultValue.

        The default date-time in ISO format. Ignored if `useCurrent` is true.  # noqa: E501

        :param date_time: The date_time of this CustomFieldContextDefaultValue.
        :type date_time: str
        """

        self._date_time = date_time

    @property
    def url(self) -> str:
        """Gets the url of this CustomFieldContextDefaultValue.

        The default URL.  # noqa: E501

        :return: The url of this CustomFieldContextDefaultValue.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url: str):
        """Sets the url of this CustomFieldContextDefaultValue.

        The default URL.  # noqa: E501

        :param url: The url of this CustomFieldContextDefaultValue.
        :type url: str
        """
        if url is None:
            raise ValueError("Invalid value for `url`, must not be `None`")  # noqa: E501

        self._url = url

    @property
    def project_id(self) -> str:
        """Gets the project_id of this CustomFieldContextDefaultValue.

        The ID of the default project.  # noqa: E501

        :return: The project_id of this CustomFieldContextDefaultValue.
        :rtype: str
        """
        return self._project_id

    @project_id.setter
    def project_id(self, project_id: str):
        """Sets the project_id of this CustomFieldContextDefaultValue.

        The ID of the default project.  # noqa: E501

        :param project_id: The project_id of this CustomFieldContextDefaultValue.
        :type project_id: str
        """
        if project_id is None:
            raise ValueError("Invalid value for `project_id`, must not be `None`")  # noqa: E501

        self._project_id = project_id

    @property
    def number(self) -> float:
        """Gets the number of this CustomFieldContextDefaultValue.

        The default floating-point number.  # noqa: E501

        :return: The number of this CustomFieldContextDefaultValue.
        :rtype: float
        """
        return self._number

    @number.setter
    def number(self, number: float):
        """Sets the number of this CustomFieldContextDefaultValue.

        The default floating-point number.  # noqa: E501

        :param number: The number of this CustomFieldContextDefaultValue.
        :type number: float
        """
        if number is None:
            raise ValueError("Invalid value for `number`, must not be `None`")  # noqa: E501

        self._number = number

    @property
    def labels(self) -> List[str]:
        """Gets the labels of this CustomFieldContextDefaultValue.

        The default labels value.  # noqa: E501

        :return: The labels of this CustomFieldContextDefaultValue.
        :rtype: List[str]
        """
        return self._labels

    @labels.setter
    def labels(self, labels: List[str]):
        """Sets the labels of this CustomFieldContextDefaultValue.

        The default labels value.  # noqa: E501

        :param labels: The labels of this CustomFieldContextDefaultValue.
        :type labels: List[str]
        """
        if labels is None:
            raise ValueError("Invalid value for `labels`, must not be `None`")  # noqa: E501

        self._labels = labels

    @property
    def text(self) -> str:
        """Gets the text of this CustomFieldContextDefaultValue.

        The default text. The maximum length is 254 characters.  # noqa: E501

        :return: The text of this CustomFieldContextDefaultValue.
        :rtype: str
        """
        return self._text

    @text.setter
    def text(self, text: str):
        """Sets the text of this CustomFieldContextDefaultValue.

        The default text. The maximum length is 254 characters.  # noqa: E501

        :param text: The text of this CustomFieldContextDefaultValue.
        :type text: str
        """

        self._text = text

    @property
    def version_id(self) -> str:
        """Gets the version_id of this CustomFieldContextDefaultValue.

        The ID of the default version.  # noqa: E501

        :return: The version_id of this CustomFieldContextDefaultValue.
        :rtype: str
        """
        return self._version_id

    @version_id.setter
    def version_id(self, version_id: str):
        """Sets the version_id of this CustomFieldContextDefaultValue.

        The ID of the default version.  # noqa: E501

        :param version_id: The version_id of this CustomFieldContextDefaultValue.
        :type version_id: str
        """
        if version_id is None:
            raise ValueError("Invalid value for `version_id`, must not be `None`")  # noqa: E501

        self._version_id = version_id

    @property
    def version_order(self) -> str:
        """Gets the version_order of this CustomFieldContextDefaultValue.

        The order the pickable versions are displayed in. If not provided, the released-first order is used. Available version orders are `\"releasedFirst\"` and `\"unreleasedFirst\"`.  # noqa: E501

        :return: The version_order of this CustomFieldContextDefaultValue.
        :rtype: str
        """
        return self._version_order

    @version_order.setter
    def version_order(self, version_order: str):
        """Sets the version_order of this CustomFieldContextDefaultValue.

        The order the pickable versions are displayed in. If not provided, the released-first order is used. Available version orders are `\"releasedFirst\"` and `\"unreleasedFirst\"`.  # noqa: E501

        :param version_order: The version_order of this CustomFieldContextDefaultValue.
        :type version_order: str
        """

        self._version_order = version_order

    @property
    def version_ids(self) -> list[str]:
        """Gets the version_ids of this CustomFieldContextDefaultValue.

        The IDs of the default versions.  # noqa: E501

        :return: The version_ids of this CustomFieldContextDefaultValue.
        :rtype: list[str]
        """
        return self._version_ids

    @version_ids.setter
    def version_ids(self, version_ids: list[str]):
        """Sets the version_ids of this CustomFieldContextDefaultValue.

        The IDs of the default versions.  # noqa: E501

        :param version_ids: The version_ids of this CustomFieldContextDefaultValue.
        :type version_ids: list[str]
        """
        if version_ids is None:
            raise ValueError("Invalid value for `version_ids`, must not be `None`")  # noqa: E501

        self._version_ids = version_ids

    @property
    def values(self) -> List[str]:
        """Gets the values of this CustomFieldContextDefaultValue.

        List of string values. The maximum length for a value is 254 characters.  # noqa: E501

        :return: The values of this CustomFieldContextDefaultValue.
        :rtype: List[str]
        """
        return self._values

    @values.setter
    def values(self, values: List[str]):
        """Sets the values of this CustomFieldContextDefaultValue.

        List of string values. The maximum length for a value is 254 characters.  # noqa: E501

        :param values: The values of this CustomFieldContextDefaultValue.
        :type values: List[str]
        """

        self._values = values

    @property
    def object(self) -> object:
        """Gets the object of this CustomFieldContextDefaultValue.

        The default JSON object.  # noqa: E501

        :return: The object of this CustomFieldContextDefaultValue.
        :rtype: object
        """
        return self._object

    @object.setter
    def object(self, object: object):
        """Sets the object of this CustomFieldContextDefaultValue.

        The default JSON object.  # noqa: E501

        :param object: The object of this CustomFieldContextDefaultValue.
        :type object: object
        """

        self._object = object
