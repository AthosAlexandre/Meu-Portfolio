import React from 'react'

import type { FormProps } from 'antd';
import { Button, Checkbox, Flex, Form, Input } from 'antd';
import { UserOutlined } from '@ant-design/icons';

type FieldType = {
  username?: string;
  password?: string;
  remember?: string;
};

const onFinish: FormProps<FieldType>['onFinish'] = (values) => {
  console.log('Success:', values);
};

const onFinishFailed: FormProps<FieldType>['onFinishFailed'] = (errorInfo) => {
  console.log('Failed:', errorInfo);
};

export default function Login() {
  return (
    <Flex justify="center" align="center" style={{ height: '100vh', width: '100%' }}>
      <Form
      name="basic"
      labelCol={{ span: 8 }}
      wrapperCol={{ span: 16 }}
      style={{ maxWidth: 600 }}
      initialValues={{ remember: true }}
      onFinish={onFinish}
      onFinishFailed={onFinishFailed}
      autoComplete="off"
        >
      <Form.Item<FieldType>
        label="Usuário"
        name="username"
        rules={[{ required: true, message: 'Por favor insira seu usuário!' }]}
    
      >
        <Input prefix={<UserOutlined />}/>
      </Form.Item>
      <Form.Item<FieldType>
        label="Senha"
        name="password"
        rules={[{ required: true, message: 'Por favor insira sua senha!' }]}
      >
        <Input.Password />
      </Form.Item>
      <Form.Item<FieldType> name="remember" valuePropName="checked" label={null}>
        <Checkbox>Remember me</Checkbox>
      </Form.Item>
      <Form.Item label={null}>
        <Button type="primary" htmlType="submit">
          Submit
        </Button>
      </Form.Item>
        </Form>
    </Flex>
  )
}